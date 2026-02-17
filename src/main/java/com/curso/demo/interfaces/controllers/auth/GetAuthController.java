package com.curso.demo.interfaces.controllers.auth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.user.AuthService;

@RestController
public class GetAuthController {
    private final AuthService authenticationService;

    public GetAuthController(AuthService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String authenticate(Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }
}
