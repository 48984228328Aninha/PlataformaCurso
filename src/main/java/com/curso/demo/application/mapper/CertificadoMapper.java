package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.infraestructure.persistence.entities.CertificadoPersistenceEntity;
import com.curso.demo.interfaces.dto.CertificadoInterfaceDto;

public class CertificadoMapper {
    public static Certificado toDomain(CertificadoInterfaceDto certificadoInterfaceDto) {
        return new Certificado(
                certificadoInterfaceDto.getIdCertificado(),
                certificadoInterfaceDto.getPercentualConcluido(),
                certificadoInterfaceDto.getAulasConcluidas());
    }

    public static CertificadoInterfaceDto toCertificadoDto(Certificado certificado) {
        return new CertificadoInterfaceDto(
                certificado.getIdCertificado(),
                certificado.getAulasConcluidas(),
                certificado.getPercentualConcluido());
    }

    public static CertificadoInterfaceDto toCertificadoDto(CertificadoPersistenceEntity certificadoPersistence) {
        return new CertificadoInterfaceDto(
                certificadoPersistence.getIdCertificado(),
                certificadoPersistence.getAulasConcluidas(),
                0);
    }
}
