package com.curso.demo.application.services.disciplina;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.domain.repositories.DisciplinaDomainRepository;

@Service
public class CreateDisciplina {
    private DisciplinaDomainRepository disciplinaDomainRepository;

    public CreateDisciplina(DisciplinaDomainRepository disciplinaDomainRepository) {
        this.disciplinaDomainRepository = disciplinaDomainRepository;
    }

    public Disciplina executar(Disciplina disciplina) {
        return disciplinaDomainRepository.save(disciplina);
    }
}
