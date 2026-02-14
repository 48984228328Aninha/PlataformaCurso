package com.curso.demo.application.services.disciplina;

import java.util.UUID;

import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.domain.repositories.DisciplinaDomainRepository;

public class GetDisciplinaById {
    private final DisciplinaDomainRepository disciplinaDomainRepository;

    public GetDisciplinaById(DisciplinaDomainRepository disciplinaDomainRepository) {
        this.disciplinaDomainRepository = disciplinaDomainRepository;
    }

    public DisciplinaDomainRepository getDisciplinaDomainRepository() {
        return disciplinaDomainRepository;
    }

    public Disciplina executar(UUID disciplinaId) {
        return disciplinaDomainRepository.findById(disciplinaId)
                .orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));
    }
}
