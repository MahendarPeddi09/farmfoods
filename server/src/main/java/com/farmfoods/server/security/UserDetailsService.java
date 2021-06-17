package com.farmfoods.server.security;

import com.farmfoods.server.model.User;
import com.farmfoods.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("userDetailsService")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        List<GrantedAuthority> userAuthorities = new ArrayList<>();
        userAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),user.getIsActive(),user.getIsActive(), user.getIsActive(), user.getIsActive(),userAuthorities);
        return new AuthenticatedUser(user.getUserName(), user1);

    }
}
