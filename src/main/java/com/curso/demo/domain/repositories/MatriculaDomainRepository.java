package com.curso.demo.domain.repositories;

import java.util.Optional;

public interface Matricula {
    Optional<Matricula> findById(Long id);

    void save(Matricula matricula);
}
