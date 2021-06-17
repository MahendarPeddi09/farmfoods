package com.farmfoods.server.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class BasicAuthentication extends UsernamePasswordAuthenticationToken {

    public BasicAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }

    public BasicAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }
}
