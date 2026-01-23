package com.curso.demo.application.services;

import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.domain.repositories.DisciplinaDomainRepository;

public class GetDisciplinaById {
    private final DisciplinaDomainRepository disciplinaDomainRepository;

    public GetDisciplinaById(DisciplinaDomainRepository disciplinaDomainRepository) {
        this.disciplinaDomainRepository = disciplinaDomainRepository;
    }

    public Disciplina executar(Long disciplinaId) {
        return disciplinaDomainRepository.findById(disciplinaId)
                .orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));
    }
}
