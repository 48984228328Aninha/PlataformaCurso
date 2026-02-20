package com.curso.demo.application.services.resultado;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.ResultadoDomainRepository;

@Service
public class DeleteResultado {
    private ResultadoDomainRepository resultadoDomainRepository;

    public DeleteResultado(ResultadoDomainRepository resultadoDomainRepository) {
        this.resultadoDomainRepository = resultadoDomainRepository;
    }

    public void executar(UUID id) {

        if (!resultadoDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Não foi possível achar o resultado");
        }

        resultadoDomainRepository.deleteById(id);
    }
}
