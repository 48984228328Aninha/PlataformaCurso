package com.curso.demo.application.services.avaliacao;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;

@Service
public class DeleteAvaliacao {
    private AvaliacaoDomainRepository avaliacaoDomainRepository;

    public DeleteAvaliacao(AvaliacaoDomainRepository avaliacaoDomainRepository) {
        this.avaliacaoDomainRepository = avaliacaoDomainRepository;
    }

    public void executar(UUID id) {

        if (!avaliacaoDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Avaliação não encontrada");
        }

        avaliacaoDomainRepository.deleteById(id);
    }
}
