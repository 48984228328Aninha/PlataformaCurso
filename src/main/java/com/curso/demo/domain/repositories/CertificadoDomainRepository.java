package com.curso.demo.domain.repositories;

import java.util.Optional;
import com.curso.demo.domain.entities.Certificado;

public interface CertificadoDomainRepository {
    Optional<Certificado> findById(Long id);

    void save(Certificado certificado);
}
