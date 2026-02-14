package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Modulo;

public interface ModuloDomainRepository {
    Optional<Modulo> findById(UUID id);

    Modulo save(Modulo modulo);
}
