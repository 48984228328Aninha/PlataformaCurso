package com.curso.demo.application.services.user;

import java.util.UUID;

import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;

public class GetUserById {
    private UsuarioDomainRepository usuarioDomainRepository;

    public GetUserById(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository;
    }

    public Usuario executar(UUID userId) {
        return usuarioDomainRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

}
