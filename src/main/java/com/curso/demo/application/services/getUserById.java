package com.curso.demo.application.services;

import com.curso.demo.domain.repositories.UsuarioDomainRepository;

public class GetUserById {
    private UsuarioDomainRepository usuarioDomainRepository;

    public GetUserById(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository;
    }

}
