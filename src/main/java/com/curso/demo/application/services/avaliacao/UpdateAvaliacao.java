package com.curso.demo.application.services.avaliacao;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;

@Service
public class UpdateAvaliacao {
    private AvaliacaoDomainRepository avaliacaoRepository;

    public UpdateAvaliacao(AvaliacaoDomainRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public Avaliacao executar(UUID id, Avaliacao novosDados) {
        Avaliacao existente = avaliacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Avaliacão não encontrada"));

        existente.setNotaMaxima(novosDados.getNotaMaxima());
        existente.setStatusAvaliacao(novosDados.getStatusAvaliacao());
        existente.setNotaMinima(novosDados.getNotaMinimaAprovacao());

        return avaliacaoRepository.save(existente);
    }
}
