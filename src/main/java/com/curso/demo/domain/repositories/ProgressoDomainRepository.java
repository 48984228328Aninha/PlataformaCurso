package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Progresso;

public interface ProgressoDomainRepository {
    Optional<Progresso> findById(Long id);

    void save(Progresso progresso);
}
