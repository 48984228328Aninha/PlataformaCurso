package com.curso.demo.application.services.certificado;

import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.domain.repositories.CertificadoDomainRepository;

public class GetCertificadoById {
    private final CertificadoDomainRepository certificadoDomainRepository;

    public GetCertificadoById(CertificadoDomainRepository certificadoDomainRepository) {
        this.certificadoDomainRepository = certificadoDomainRepository;
    }

    public CertificadoDomainRepository getCertificadoDomainRepository() {
        return certificadoDomainRepository;
    }

    public Certificado executar(Long certificadoId) {
        return certificadoDomainRepository.findById(certificadoId)
                .orElseThrow(() -> new RuntimeException("Não possui certificado"));
    }
}
