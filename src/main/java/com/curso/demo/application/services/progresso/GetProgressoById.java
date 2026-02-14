package com.curso.demo.application.services.progresso;

import java.util.UUID;

import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.domain.repositories.ProgressoDomainRepository;

public class GetProgressoById {
    private final ProgressoDomainRepository progressoDomainRepository;

    public GetProgressoById(ProgressoDomainRepository progressoDomainRepository) {
        this.progressoDomainRepository = progressoDomainRepository;
    }

    public ProgressoDomainRepository getProgressoDomainRepository() {
        return progressoDomainRepository;
    }

    public Progresso executar(UUID progressoId) {
        return progressoDomainRepository.findById(progressoId)
                .orElseThrow(() -> new RuntimeException("Você ainda não tem um progresso"));
    }
}
