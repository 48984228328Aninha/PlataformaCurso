package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Disciplina;

public interface DisciplinaDomainRepository {
    Optional<Disciplina> findById(Long id);

    void save(Disciplina disciplina);
}
