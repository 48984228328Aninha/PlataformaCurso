package com.curso.demo.infraestructure.adapter.repositories.certificado;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.CertificadoMapper;
import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.domain.repositories.CertificadoDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.CertificadoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaCertificadoRepository;

@Repository
public class ImplCertificadoRepository implements CertificadoDomainRepository {
    private JpaCertificadoRepository jpaCertificadoRepository;

    public ImplCertificadoRepository(JpaCertificadoRepository jpaCertificadoRepository) {
        this.jpaCertificadoRepository = jpaCertificadoRepository;
    }

    @Override
    public Optional<Certificado> findById(UUID id) {
        return jpaCertificadoRepository.findById(id)
                .map(CertificadoMapper::toDomain);
    }

    @Override
    public Certificado save(Certificado certificado) {
        CertificadoPersistenceEntity certificadoPersistenceEntity = CertificadoMapper.toEntity(certificado);

        CertificadoPersistenceEntity saved = jpaCertificadoRepository.save(certificadoPersistenceEntity);

        return CertificadoMapper.toDomain(saved);
    }

    @Override
    public void deleteById(UUID id) {
        jpaCertificadoRepository.deleteById(id);
    }

}
