package com.curso.demo.application.services.certificado;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.CertificadoDomainRepository;

@Service
public class DeleteCertificado {
    private CertificadoDomainRepository certificadoDomainRepository;

    public DeleteCertificado(CertificadoDomainRepository certificadoDomainRepository) {
        this.certificadoDomainRepository = certificadoDomainRepository;
    }

    public void executar(UUID id) {

        if (!certificadoDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Certificado não encontrado");
        }

        certificadoDomainRepository.deleteById(id);
    }
}
