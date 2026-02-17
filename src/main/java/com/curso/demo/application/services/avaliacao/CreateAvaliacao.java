package com.curso.demo.application.services.avaliacao;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;

@Service
public class CreateAvaliacao {
    private AvaliacaoDomainRepository avaliacaoRepository;

    public CreateAvaliacao(AvaliacaoDomainRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public Avaliacao executar(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

}
