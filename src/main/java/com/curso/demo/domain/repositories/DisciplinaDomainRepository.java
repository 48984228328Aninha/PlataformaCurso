package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Disciplina;

public interface DisciplinaDomainRepository {
    Optional<Disciplina> findById(UUID id);

    Disciplina save(Disciplina disciplina);

    void deleteById(UUID id);
}
