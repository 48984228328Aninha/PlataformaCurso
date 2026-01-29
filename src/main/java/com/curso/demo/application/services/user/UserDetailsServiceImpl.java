package com.curso.demo.application.services.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.curso.demo.infraestructure.persistence.entities.UsuarioAutenticadoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaUsuarioRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
    private final JpaUsuarioRepository jpaUsuarioRepository;

    public UserDetailsServiceImpl(JpaUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) {
        return jpaUsuarioRepository.findByUsername(username)
                .map(UsuarioAutenticadoPersistenceEntity::new)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}
