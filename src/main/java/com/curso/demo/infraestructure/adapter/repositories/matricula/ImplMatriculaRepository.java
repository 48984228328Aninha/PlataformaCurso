package com.curso.demo.infraestructure.adapter.repositories.matricula;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.MatriculaMapper;
import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.domain.repositories.MatriculaDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.MatriculaPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaMatriculaRepository;

@Repository
public class ImplMatriculaRepository implements MatriculaDomainRepository {
    private JpaMatriculaRepository jpaMatriculaRepository;

    public ImplMatriculaRepository(JpaMatriculaRepository jpaMatriculaRepository) {
        this.jpaMatriculaRepository = jpaMatriculaRepository;
    }

    @Override
    public Optional<Matricula> findById(UUID id) {
        return jpaMatriculaRepository.findById(id)
                .map(MatriculaMapper::toDomain);
    }

    @Override
    public Matricula save(Matricula matricula) {
        MatriculaPersistenceEntity matriculaPersistence = MatriculaMapper.toEntity(matricula);

        MatriculaPersistenceEntity saved = jpaMatriculaRepository.save(matriculaPersistence);

        return MatriculaMapper.toDomain(saved);
    }

}
