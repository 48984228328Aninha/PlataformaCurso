package com.curso.demo.domain.repositories;

import java.util.Optional;

public interface MatriculaDomainRepository {
    Optional<Matricula> findById(Long id);

    void save(Matricula matricula);
}
