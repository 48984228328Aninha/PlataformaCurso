package com.curso.demo.domain.repositories;

import java.util.Optional;
import com.curso.demo.domain.entities.Avaliacao;

public interface AvaliacaoDomainRepository {
    Optional<Avaliacao> findById(Long id);

    void save(Avaliacao avaliacao);
}
