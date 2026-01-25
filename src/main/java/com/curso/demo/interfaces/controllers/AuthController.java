package com.curso.demo.interfaces.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.user.AuthService;

@RestController
public class AuthController {
    private final AuthService authenticationService;

    public AuthController(AuthService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String getMessage() {
        return "hello from api controller";
    }
}
