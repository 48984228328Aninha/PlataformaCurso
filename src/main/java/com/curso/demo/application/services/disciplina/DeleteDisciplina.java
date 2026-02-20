package com.curso.demo.application.services.disciplina;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.DisciplinaDomainRepository;

@Service
public class DeleteDisciplina {
    private DisciplinaDomainRepository disciplinaDomainRepository;

    public DeleteDisciplina(DisciplinaDomainRepository disciplinaDomainRepository) {
        this.disciplinaDomainRepository = disciplinaDomainRepository;
    }

    public void executar(UUID id) {

        if (!disciplinaDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Disciplina não encontrada");
        }

        disciplinaDomainRepository.deleteById(id);
    }
}
