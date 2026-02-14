package com.curso.demo.infraestructure.adapter.repositories.resultado;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.ResultadoMapper;
import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.domain.repositories.ResultadoDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.ResultadoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaResultadoRepository;

@Repository
public class ImplResultadoRepository implements ResultadoDomainRepository {
    private JpaResultadoRepository jpaResultadoRepository;

    public ImplResultadoRepository(JpaResultadoRepository jpaResultadoRepository) {
        this.jpaResultadoRepository = jpaResultadoRepository;
    }

    @Override
    public Optional<Resultado> findById(UUID id) {
        return jpaResultadoRepository.findById(id)
                .map(ResultadoMapper::toDomain);
    }

    @Override
    public Resultado save(Resultado resultado) {
        ResultadoPersistenceEntity resultadoPersistence = ResultadoMapper.toEntity(resultado);

        ResultadoPersistenceEntity saved = jpaResultadoRepository.save(resultadoPersistence);

        return ResultadoMapper.toDomain(saved);
    }

}
