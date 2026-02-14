package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Resultado;

public interface ResultadoDomainRepository {
    Optional<Resultado> findById(UUID id);

    Resultado save(Resultado resultado);
}
