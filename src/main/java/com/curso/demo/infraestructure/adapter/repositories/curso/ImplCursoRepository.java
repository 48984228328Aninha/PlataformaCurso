package com.curso.demo.infraestructure.adapter.repositories.curso;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.CursoResultadoMapper;
import com.curso.demo.domain.entities.Curso;
import com.curso.demo.domain.repositories.CursoDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaCursoRepository;

@Repository
public class ImplCursoRepository implements CursoDomainRepository {
    private JpaCursoRepository jpaCursoRepository;

    public ImplCursoRepository(JpaCursoRepository jpaCursoRepository) {
        this.jpaCursoRepository = jpaCursoRepository;
    }

    @Override
    public Optional<Curso> findById(UUID id) {
        return jpaCursoRepository.findById(id)
                .map(CursoResultadoMapper::toDomain);
    }

    @Override
    public Curso save(Curso curso) {
        CursoPersistenceEntity cursoEntity = CursoResultadoMapper.toEntity(curso);

        CursoPersistenceEntity saved = jpaCursoRepository.save(cursoEntity);

        return CursoResultadoMapper.toDomain(saved);
    }

    @Override
    public void deleteById(UUID id) {
        jpaCursoRepository.deleteById(id);
    }

}
