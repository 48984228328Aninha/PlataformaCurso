package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Certificado;

public interface CertificadoDomainRepository {
    Optional<Certificado> findById(UUID id);

    void save(Certificado certificado);
}
