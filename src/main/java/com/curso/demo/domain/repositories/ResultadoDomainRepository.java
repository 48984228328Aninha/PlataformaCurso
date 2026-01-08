package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Resultado;

public interface ResultadoDomainRepository {
    Optional<Resultado> findById(Long id);

    void save(Resultado resultado);
}
