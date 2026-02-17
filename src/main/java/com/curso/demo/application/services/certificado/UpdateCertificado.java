package com.curso.demo.application.services.certificado;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.domain.repositories.CertificadoDomainRepository;

@Service
public class UpdateCertificado {
    private CertificadoDomainRepository certificadoDomainRepository;

    public UpdateCertificado(CertificadoDomainRepository certificadoDomainRepository) {
        this.certificadoDomainRepository = certificadoDomainRepository;
    }

    public Certificado executar(UUID id, Certificado novosDados) {
        Certificado existente = certificadoDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Certificado não encontrado"));

        novosDados.setAulasConcluidas(novosDados.getAulasConcluidas());
        novosDados.setPercentualCOncluido(novosDados.getPercentualConcluido());
        novosDados.setTempoTotalEstudado(novosDados.getTempoTotalEstudado());
        novosDados.setTotalAulasCertificado(novosDados.getTotalAulasCertificado());

        return certificadoDomainRepository.save(existente);

    }
}
