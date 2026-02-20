package com.curso.demo.application.services.progresso;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.ProgressoDomainRepository;

@Service
public class DeleteProgresso {
    private ProgressoDomainRepository progressoDomainRepository;

    public DeleteProgresso(ProgressoDomainRepository progressoDomainRepository) {
        this.progressoDomainRepository = progressoDomainRepository;
    }

    public void executar(UUID id) {

        if (!progressoDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Você ainda não possui progresso");
        }

        progressoDomainRepository.deleteById(id);
    }
}
