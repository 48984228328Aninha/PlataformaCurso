package com.curso.demo.application.services.user;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.curso.demo.application.services.jwt.JwtService;

@Service
public class AuthService {
    private final JwtService jwtService;

    public AuthService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}
