package com.curso.demo.infraestructure.adapter.repositories.avaliacao;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.AvaliacaoMapper;
import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.AvaliacaoPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaAvaliacaoRepository;

@Repository
public class ImplAvaliacaoRepository implements AvaliacaoDomainRepository {
    public JpaAvaliacaoRepository avaliacaoRepository;

    public ImplAvaliacaoRepository(JpaAvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    @Override
    public Optional<Avaliacao> findById(UUID id) {
        return avaliacaoRepository.findById(id)
                .map(AvaliacaoMapper::toDomain);
    }

    @Override
    public Avaliacao save(Avaliacao avaliacao) {
        AvaliacaoPersistenceEntity entity = AvaliacaoMapper.toEntity(avaliacao);

        AvaliacaoPersistenceEntity saved = avaliacaoRepository.save(entity);

        return AvaliacaoMapper.toDomain(saved);
    }

    @Override
    public void deleteById(UUID id) {
        avaliacaoRepository.deleteById(id);

    }
}
