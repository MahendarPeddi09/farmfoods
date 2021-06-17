package com.farmfoods.server.security;

import com.farmfoods.server.model.User;
import com.farmfoods.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class JpaBasicAuthProvider implements AuthenticationProvider {

    @Autowired
    UserRepository userRepository;

    @Qualifier(value = "noop")
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userId = authentication.getName();
        String password = authentication.getCredentials().toString();
        User user = userRepository.findByUserName(userId);
        try{
            if(user == null)
                throw new UsernameNotFoundException("user is not for the given user id : " + userId);
            if(userId.equalsIgnoreCase(user.getUserName()) && passwordEncoder.matches(password, user.getPassword())){
                List<GrantedAuthority> userAuthorities = new ArrayList<>();
                userAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
                org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),user.getIsActive(),user.getIsActive(), user.getIsActive(), user.getIsActive(),userAuthorities);
                AuthenticatedUser authenticatedUser = new AuthenticatedUser(user.getUserName(), user1);

                return new BasicAuthentication(authenticatedUser, null, authenticatedUser.getAuthorities());
            }else
                throw new BadCredentialsException("Bad Credentails");
        }catch (AuthenticationException authException){
            throw authException;
        }

    }

    @Override
    public boolean supports(Class<?> authType) {
        return UsernamePasswordAuthenticationToken.class.equals(authType);
    }
}
