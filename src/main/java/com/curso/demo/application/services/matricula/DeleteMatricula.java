package com.curso.demo.application.services.matricula;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.MatriculaDomainRepository;

@Service
public class DeleteMatricula {
    private MatriculaDomainRepository matriculaDomainRepository;

    public DeleteMatricula(MatriculaDomainRepository matriculaDomainRepository) {
        this.matriculaDomainRepository = matriculaDomainRepository;
    }

    public void executar(UUID id) {

        if (!matriculaDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Não foi possível achar sua matrícula");
        }

        matriculaDomainRepository.deleteById(id);
    }

}
