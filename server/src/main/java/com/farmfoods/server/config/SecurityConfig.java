package com.farmfoods.server.config;

import com.farmfoods.server.filters.AuthFilter;
import com.farmfoods.server.security.JpaBasicAuthProvider;
import com.farmfoods.server.security.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.beans.BeanProperty;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    JpaBasicAuthProvider jpaBasicAuthProvider;

    @Autowired
    AuthFilter authFilter;

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(jpaBasicAuthProvider);
    }

    @Bean(name = "bcrypt")
    public PasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean(name = "noop")
    public PasswordEncoder noOpPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.addFilterAt(authFilter, BasicAuthenticationFilter.class).authorizeRequests()
//                .antMatchers("/api/**").authenticated()
//                .anyRequest().permitAll()
//                .and().httpBasic();
        http.authorizeRequests().anyRequest().permitAll();

    }
}
