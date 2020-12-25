package com.backend.geo_monument.Config;

import com.backend.geo_monument.Models.User;
import com.backend.geo_monument.Services.AuthService;
import com.backend.geo_monument.Utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private AuthService authService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = null; // * THE TOKEN FROM THE HEADER
        String id = null; // * THE USER ID

        // * 1 - GET THE AUTHORIZATION HEADER
        final String requestTokenHeader = request.getHeader("Authorization");

        // * 2 - CHECK IF TOKEN IN THE HEADER && THE TOKEN BEGIN WITH Bearer WORD.
        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
            // * 3 - GET TOKEN AFTER Bearer
            token = requestTokenHeader.substring(7);
            // * 3 - GET ID FROM TOKEN
            id = jwtTokenUtil.getIdFromToken(token);
        } else {
            logger.warn("JWT Token does not begin with Bearer String");
        }
        // * 5- ONE WE GET THE TOKEN
        if (id != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // * 4 - CHECK IF THE USER EXIST WITH ID
            User user = authService.loadUserById(Long.parseLong(id));

            if (jwtTokenUtil.validateToken(token, user)) {
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null,
                        user.getAuthorities());

                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }

        filterChain.doFilter(request, response);

    }

}