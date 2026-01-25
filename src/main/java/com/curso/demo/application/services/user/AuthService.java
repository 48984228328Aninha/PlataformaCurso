package com.curso.demo.application.services.user;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private String authenticate() {
        return "token";
    }
}
