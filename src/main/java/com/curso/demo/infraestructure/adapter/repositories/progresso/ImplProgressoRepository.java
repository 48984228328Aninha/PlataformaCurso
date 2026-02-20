package com.curso.demo.infraestructure.adapter.repositories.progresso;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.ProgressoMapper;
import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.domain.repositories.ProgressoDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.ProgressoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaProgressoRepository;

@Repository
public class ImplProgressoRepository implements ProgressoDomainRepository {
    private JpaProgressoRepository jpaProgressoRepository;

    public ImplProgressoRepository(JpaProgressoRepository jpaProgressoRepository) {
        this.jpaProgressoRepository = jpaProgressoRepository;
    }

    @Override
    public Optional<Progresso> findById(UUID id) {
        return jpaProgressoRepository.findById(id)
                .map(ProgressoMapper::toDomain);
    }

    @Override
    public Progresso save(Progresso progresso) {
        ProgressoPersistenceEntity progressoEntity = ProgressoMapper.toEntity(progresso);

        ProgressoPersistenceEntity saved = jpaProgressoRepository.save(progressoEntity);

        return ProgressoMapper.toDomain(saved);
    }

    @Override
    public void deleteById(UUID id) {
        jpaProgressoRepository.deleteById(id);
    }

}
