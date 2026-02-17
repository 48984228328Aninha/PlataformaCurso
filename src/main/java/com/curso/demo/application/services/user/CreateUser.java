package com.curso.demo.application.services.user;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;

@Service
public class CreateUser {
    private UsuarioDomainRepository usuarioDomainRepository;

    public CreateUser(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public Usuario executar(Usuario usuario) {
        return usuarioDomainRepository.save(usuario);
    }
}
