package com.curso.demo.infraestructure.adapter.repositories.disciplina;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.DisciplinaMapper;
import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.domain.repositories.DisciplinaDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.DisciplinaPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaDisciplinaRepository;

@Repository
public class ImplDisciplinaRepository implements DisciplinaDomainRepository {
    private JpaDisciplinaRepository jpaDisciplinaRepository;

    public ImplDisciplinaRepository(JpaDisciplinaRepository jpaDisciplinaRepository) {
        this.jpaDisciplinaRepository = jpaDisciplinaRepository;
    }

    @Override
    public Optional<Disciplina> findById(UUID id) {
        return jpaDisciplinaRepository.findById(id)
                .map(DisciplinaMapper::toDomain);
    }

    @Override
    public Disciplina save(Disciplina disciplina) {
        DisciplinaPersistenceEntity disciplinaEntity = DisciplinaMapper.toEntity(disciplina);

        DisciplinaPersistenceEntity saved = jpaDisciplinaRepository.save(disciplinaEntity);

        return DisciplinaMapper.toDomain(saved);
    }

}
