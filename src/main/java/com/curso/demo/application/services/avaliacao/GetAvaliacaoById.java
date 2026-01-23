package com.curso.demo.application.services.avaliacao;

import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;

public class GetAvaliacaoById {
    private final AvaliacaoDomainRepository avaliacaoDomainRepository;

    public GetAvaliacaoById(AvaliacaoDomainRepository avaliacaoDomainRepository) {
        this.avaliacaoDomainRepository = avaliacaoDomainRepository;
    }

    public Avaliacao executar(Long avaliacaoId) {
        return avaliacaoDomainRepository.findById(avaliacaoId)
                .orElseThrow(() -> new RuntimeException("Avaliacao nao encontrada"));
    }
}
