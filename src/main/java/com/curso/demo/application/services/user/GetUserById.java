package com.curso.demo.application.services.user;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

public class GetUserById {
    private UsuarioDomainRepository usuarioDomainRepository;

    public GetUserById(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository;
    }

    public Optional<UsuarioInterfaceDto> executar(UUID userId) {
        return usuarioDomainRepository.findById(userId)
                .map(UsuarioMapper::toUsuarioDto);
    }

}
