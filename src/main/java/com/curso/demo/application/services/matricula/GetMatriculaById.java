package com.curso.demo.application.services.matricula;

import java.util.UUID;

import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.domain.repositories.MatriculaDomainRepository;

public class GetMatriculaById {
    private final MatriculaDomainRepository matriculaDomainRepository;

    public GetMatriculaById(MatriculaDomainRepository matriculaDomainRepository) {
        this.matriculaDomainRepository = matriculaDomainRepository;
    }

    public MatriculaDomainRepository getMatriculaDomainRepository() {
        return matriculaDomainRepository;
    }

    public Matricula executar(UUID matriculaId) {
        return matriculaDomainRepository.findById(matriculaId)
                .orElseThrow(() -> new RuntimeException("Não possui matrícula"));
    }
}
