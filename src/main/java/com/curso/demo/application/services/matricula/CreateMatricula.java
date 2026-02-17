package com.curso.demo.application.services.matricula;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.domain.repositories.MatriculaDomainRepository;

@Service
public class CreateMatricula {
    private MatriculaDomainRepository matriculaDomainRepository;

    public CreateMatricula(MatriculaDomainRepository matriculaDomainRepository) {
        this.matriculaDomainRepository = matriculaDomainRepository;
    }

    public Matricula executar(Matricula matricula) {
        return matriculaDomainRepository.save(matricula);
    }
}
