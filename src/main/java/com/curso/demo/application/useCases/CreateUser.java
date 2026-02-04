package com.curso.demo.application.useCases;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

public class CreateUser {
    private final UsuarioDomainRepository usuarioDomainRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public CreateUser(UsuarioDomainRepository usuarioDomainRepository, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioDomainRepository = usuarioDomainRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario criarUsuario(UsuarioInterfaceDto usuario) {
        String senhaHash = passwordEncoder.encode(usuario.getPassword());

        Usuario usuarioDomain = UsuarioMapper.toDomain(
                usuario,
                senhaHash, null,
                "Ativo", null);
        return usuarioDomainRepository.save(usuarioDomain);
    }
}
