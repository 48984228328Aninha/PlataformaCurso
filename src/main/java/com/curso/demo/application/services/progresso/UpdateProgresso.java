package com.curso.demo.application.services.progresso;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.domain.repositories.ProgressoDomainRepository;

@Service
public class UpdateProgresso {
    private ProgressoDomainRepository progressoDomainRepository;

    public UpdateProgresso(ProgressoDomainRepository progressoDomainRepository) {
        this.progressoDomainRepository = progressoDomainRepository;
    }

    public Progresso executar(UUID id, Progresso novosDados) {
        Progresso existente = progressoDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ainda não tem progresso"));

        novosDados.setAulasConcluidas(novosDados.getAulasConcluidas());
        novosDados.setTempoTotalEstudado(novosDados.getTempoTotalEstudado());
        novosDados.setTotalAulas(novosDados.getTotalAulas());
        novosDados.setUltimaAtividadeRealizada(novosDados.getUltimaAtividadeRealizada());

        return progressoDomainRepository.save(existente);
    }
}
