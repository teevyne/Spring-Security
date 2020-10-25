//package com.authjwt.AuthMySQL.services;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Collection;
//
//public interface UserDetails {
//
//    Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(username, password)
//            );
//
//    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//
//    Collection<? extends GrantedAuthority> getAuthorities();
////    HttpServletRequest authenticationManager = ;
////     userDetails.getUsername()
////     userDetails.getPassword()
////     userDetails.getAuthorities()
//}
