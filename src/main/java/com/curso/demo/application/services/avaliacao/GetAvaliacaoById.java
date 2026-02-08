package com.curso.demo.application.services.avaliacao;

import com.curso.demo.application.mapper.AvaliacaoMapper;
import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;

public class GetAvaliacaoById {
    private final AvaliacaoDomainRepository avaliacaoDomainRepository;

    public GetAvaliacaoById(AvaliacaoDomainRepository avaliacaoDomainRepository) {
        this.avaliacaoDomainRepository = avaliacaoDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository();
    }

    public Avaliacao executar(Long avaliacaoId) {
        return avaliacaoDomainRepository.findById(avaliacaoId)
                .map(AvaliacaoMapper::toDomain);

    }
}
