package com.farmfoods.server.filters;

import com.farmfoods.server.security.BasicAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.http.HttpRequest;

//@Component
@Order(value = 300)
public class AuthFilter implements Filter {

    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //servletRequest.getAttribute()

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        System.out.println(httpRequest.getUserPrincipal());
        System.out.println(httpRequest.getHeaderNames());
        System.out.println(httpRequest.getAuthType());
        Authentication a = new BasicAuthentication(httpRequest.getHeaders("userName"),httpRequest.getHeader("password"));

        System.out.println(SecurityContextHolder.getContext());
        authenticationManager.authenticate(a);
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println(servletRequest.toString());
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(servletResponse.toString());
    }
}
