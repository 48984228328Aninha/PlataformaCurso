package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Avaliacao;

public interface AvaliacaoDomainRepository {
    Optional<Avaliacao> findById(UUID id);

    Avaliacao save(Avaliacao avaliacao);
}
