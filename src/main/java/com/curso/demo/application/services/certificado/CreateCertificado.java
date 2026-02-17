package com.curso.demo.application.services.certificado;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.domain.repositories.CertificadoDomainRepository;

@Service
public class CreateCertificado {
    private CertificadoDomainRepository certificadoDomainRepository;

    public CreateCertificado(CertificadoDomainRepository certificadoRepository) {
        this.certificadoDomainRepository = certificadoRepository;
    }

    public Certificado executar(Certificado certificado) {
        return certificadoDomainRepository.save(certificado);
    }
}
