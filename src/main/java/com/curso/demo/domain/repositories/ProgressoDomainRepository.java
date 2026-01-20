package com.curso.demo.domain.repositories;

import java.util.Optional;

public interface ProgressoDomainRepository {
    Optional<ProgressoDomainRepository> findById(Long id);

    void save(ProgressoDomainRepository progresso);
}
