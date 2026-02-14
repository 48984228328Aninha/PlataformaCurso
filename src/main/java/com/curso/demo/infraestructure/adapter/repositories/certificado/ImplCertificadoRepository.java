package com.curso.demo.infraestructure.adapter.repositories.certificado;

import org.springframework.stereotype.Repository;

import com.curso.demo.domain.repositories.CertificadoDomainRepository;
import com.curso.demo.infraestructure.persistence.repositories.JpaCertificadoRepository;

@Repository
public class ImplCertificadoRepository implements CertificadoDomainRepository {
    private JpaCertificadoRepository jpaCertificadoRepository;

    public ImplCertificadoRepository(JpaCertificadoRepository jpaCertificadoRepository) {
        this.jpaCertificadoRepository = jpaCertificadoRepository;
    }

}
