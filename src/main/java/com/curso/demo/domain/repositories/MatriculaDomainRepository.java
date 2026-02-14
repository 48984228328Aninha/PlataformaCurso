package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Matricula;

public interface MatriculaDomainRepository {
    Optional<Matricula> findById(UUID id);

    Matricula save(Matricula matricula);
}
