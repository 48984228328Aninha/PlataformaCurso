package com.curso.demo.domain.repositories;

import java.util.Optional;

public interface MatriculaDomainRepository {
    Optional<MatriculaDomainRepository> findById(Long id);

    void save(MatriculaDomainRepository matricula);
}
