package com.curso.demo.application.services.certificado;

import org.springframework.stereotype.Service;

import com.curso.demo.application.mapper.CertificadoMapper;
import com.curso.demo.domain.repositories.CertificadoDomainRepository;
import com.curso.demo.interfaces.dto.CertificadoInterfaceDto;

@Service
public class GetCertificadoById {
    private final CertificadoDomainRepository certificadoDomainRepository;

    public GetCertificadoById(CertificadoDomainRepository certificadoDomainRepository) {
        this.certificadoDomainRepository = certificadoDomainRepository;
    }

    public CertificadoDomainRepository getCertificadoDomainRepository() {
        return certificadoDomainRepository;
    }

    public CertificadoInterfaceDto executar(Long certificadoId) {
        return certificadoDomainRepository.findById(certificadoId)
                .map(CertificadoMapper::toCertificadoDto)
                .orElseThrow(() -> new RuntimeException("Não possui certificado"));
    }
}
