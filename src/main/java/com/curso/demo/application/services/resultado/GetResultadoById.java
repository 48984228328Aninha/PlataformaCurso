package com.curso.demo.application.services.resultado;

import java.util.UUID;

import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.domain.repositories.ResultadoDomainRepository;

public class GetResultadoById {
    private final ResultadoDomainRepository resultadoDomainRepository;

    public GetResultadoById(ResultadoDomainRepository resultadoDomainRepository) {
        this.resultadoDomainRepository = resultadoDomainRepository;
    }

    public ResultadoDomainRepository getResultadoDomainRepository() {
        return resultadoDomainRepository;
    }

    public Resultado executar(UUID idResultado) {
        return resultadoDomainRepository.findById(idResultado)
                .orElseThrow(() -> new RuntimeException("Ainda não há resultado"));
    }
}
