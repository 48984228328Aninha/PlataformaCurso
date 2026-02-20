package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Progresso;

public interface ProgressoDomainRepository {
    Optional<Progresso> findById(UUID id);

    Progresso save(Progresso progresso);

    void deleteById(UUID id);
}
