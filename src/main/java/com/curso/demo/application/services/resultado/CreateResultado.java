package com.curso.demo.application.services.resultado;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.domain.repositories.ResultadoDomainRepository;

@Service
public class CreateResultado {
    private ResultadoDomainRepository resultadoDomainRepository;

    public CreateResultado(ResultadoDomainRepository resultadoDomainRepository) {
        this.resultadoDomainRepository = resultadoDomainRepository;
    }

    public Resultado executar(Resultado resultado) {
        return resultadoDomainRepository.save(resultado);
    }
}
