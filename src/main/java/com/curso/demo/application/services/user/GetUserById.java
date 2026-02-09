package com.curso.demo.application.services.user;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

@Service
public class GetUserById {
    private UsuarioDomainRepository usuarioDomainRepository;

    public GetUserById(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository;
    }

    public UsuarioInterfaceDto executar(UUID userId) {
        return usuarioDomainRepository.findById(userId)
                .map(UsuarioMapper::toUsuarioDto)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

}
