package com.curso.demo.application.services.progresso;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.domain.repositories.ProgressoDomainRepository;

@Service
public class CreateProgresso {
    private ProgressoDomainRepository progressoDomainRepository;

    public CreateProgresso(ProgressoDomainRepository progressoDomainRepository) {
        this.progressoDomainRepository = progressoDomainRepository;
    }

    public Progresso executar(Progresso progresso) {
        return progressoDomainRepository.save(progresso);
    }
}
