package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Modulo;

public interface ModuloDomainRepository {
    Optional<Modulo> findById(Long id);

    void save(Modulo modulo);
}
