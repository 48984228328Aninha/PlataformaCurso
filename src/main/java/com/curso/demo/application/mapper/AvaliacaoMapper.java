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
}
