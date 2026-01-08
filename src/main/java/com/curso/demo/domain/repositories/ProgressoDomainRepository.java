package com.curso.demo.domain.repositories;

import java.util.Optional;

public interface Progresso {
    Optional<Progresso> findById(Long id);

    void save(Progresso progresso);
}
