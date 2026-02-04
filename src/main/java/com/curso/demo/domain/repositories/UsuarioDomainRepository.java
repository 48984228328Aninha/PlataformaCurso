package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Usuario;

public interface UsuarioDomainRepository {
    Optional<Usuario> findById(UUID id);

    Usuario save(Usuario usuario);
}