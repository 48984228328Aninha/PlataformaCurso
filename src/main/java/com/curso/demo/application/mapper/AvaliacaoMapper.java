package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.infraestructure.persistence.entities.AvaliacaoPersistenceEntity;
import com.curso.demo.interfaces.dto.AvaliacaoInterfaceDto;

public class AvaliacaoMapper {

    public static Avaliacao toDomain(AvaliacaoInterfaceDto avaliacaoInterfaceDto) {
        return new Avaliacao(
                avaliacaoInterfaceDto.getIdAvaliacao(),
                avaliacaoInterfaceDto.getTituloAvaliacao(),
                avaliacaoInterfaceDto.getTipo(),
                "Matemática",
                100,
                60,
                3,
                60,
                avaliacaoInterfaceDto.getTipo().equals("Ativa")

        );
    }

    public static AvaliacaoInterfaceDto toAvaliacaoDto(Avaliacao avaliacao) {
        return new AvaliacaoInterfaceDto(
                avaliacao.getIdAvaliacao(),
                avaliacao.getTitulo(),
                avaliacao.getStatusAvaliacao() ? "Ativa" : "Inativa");
    }

    public static AvaliacaoInterfaceDto toAvaliacaoDto(AvaliacaoPersistenceEntity avaliacaoPersistence) {
        return new AvaliacaoInterfaceDto(
                avaliacaoPersistence.getIdAvaliacao(),
                avaliacaoPersistence.getTitulo(),
                avaliacaoPersistence.getStatusAvaliacao() ? "Ativa" : "Inativa");
    }

    public static AvaliacaoPersistenceEntity toEntity(Avaliacao avaliacao) {
        return new AvaliacaoPersistenceEntity(
                avaliacao.getIdAvaliacao(),
                avaliacao.getTitulo(),
                avaliacao.getStatusAvaliacao());
    }

    public static Avaliacao toDomain(AvaliacaoPersistenceEntity avaliacaoPersistenceEntity) {
        return new Avaliacao(
                avaliacaoPersistenceEntity.getIdAvaliacao(),
                avaliacaoPersistenceEntity.getTitulo(),
                "Desconhecido",
                "Matemática",
                100.0,
                60.0,
                3,
                60,
                avaliacaoPersistenceEntity.getStatusAvaliacao());
    }

}
