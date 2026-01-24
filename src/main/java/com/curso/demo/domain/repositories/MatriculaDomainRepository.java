package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Matricula;

public interface MatriculaDomainRepository {
    Optional<Matricula> findById(Long id);

    void save(Matricula matricula);
}
