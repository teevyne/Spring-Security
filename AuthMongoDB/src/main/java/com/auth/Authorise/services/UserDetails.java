package com.auth.Authorise.services;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public interface UserDetails {
    // Where does the object creation below go into
    Authentication authentication =
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

    org.springframework.security.core.userdetails.UserDetails userDetails = (org.springframework.security.core.userdetails.UserDetails) authentication.getPrincipal();
    // userDetails.getUsername()
    // userDetails.getPassword()
    // userDetails.getAuthorities()
}
