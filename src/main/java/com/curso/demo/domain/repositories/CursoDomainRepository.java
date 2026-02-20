package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Curso;

public interface CursoDomainRepository {
    Optional<Curso> findById(UUID idCurso);

    Curso save(Curso curso);

    void deleteById(UUID id);
}
