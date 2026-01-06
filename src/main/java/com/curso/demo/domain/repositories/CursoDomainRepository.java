package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Curso;

public interface CursoDomainRepository {
    Optional<Curso> findById(Long id);

    void save(Curso curso);
}
