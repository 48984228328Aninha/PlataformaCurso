package com.curso.demo.application.services;

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

    public Resultado executar(Long idResultado) {
        return resultadoDomainRepository.findById(idResultado)
                .orElseThrow(() -> new RuntimeException("Ainda não há resultado"));
    }
}
