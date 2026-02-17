package com.curso.demo.application.services.user;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;

@Service
public class UpdateUser {
    private UsuarioDomainRepository usuarioDomainRepository;

    public UpdateUser(UsuarioDomainRepository usuarioDomainRepository) {
        this.usuarioDomainRepository = usuarioDomainRepository;
    }

    public Usuario executar(UUID id, Usuario novosDados) {
        Usuario existente = usuarioDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não existente"));

        novosDados.setEmail(novosDados.getEmail());
        novosDados.setFotoDePerfil(novosDados.getFotoDePerfil());
        novosDados.setNomeDeExibicao(novosDados.getNomeDeExibicao());
        novosDados.setPassword(novosDados.getPassword());
        novosDados.setPreferenciasDeIdioma(novosDados.getPreferenciasDeIdioma());
        novosDados.setProgresso(novosDados.getProgresso());
        novosDados.setRole(novosDados.getRole());
        novosDados.setStatus(novosDados.getStatus());
        novosDados.setUsername(novosDados.getUsername());

        return usuarioDomainRepository.save(existente);
    }
}
