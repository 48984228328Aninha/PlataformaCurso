package com.curso.demo.application.services.user;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.UsuarioDomainRepository;

@Service
public class DeleteUser {
    private UsuarioDomainRepository usuarioDomainRepository;

    public DeleteUser(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public void executar(UUID id) {

        if (!usuarioDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Não foi possível achar o usuário");
        }

        usuarioDomainRepository.deleteById(id);
    }
}
