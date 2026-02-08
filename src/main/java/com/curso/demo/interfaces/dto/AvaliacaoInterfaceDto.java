package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.AvaliacaoPersistenceEntity;

public class AvaliacaoInterfaceDto {
    private UUID idAvaliacao;
    private String tituloAvaliacao;
    private String tipo;

    public AvaliacaoInterfaceDto(UUID idAvaliacao, String tituloAvaliacao, String tipo) {
        this.idAvaliacao = idAvaliacao;
        this.tituloAvaliacao = tituloAvaliacao;
        this.tipo = tipo;
    }

    public AvaliacaoInterfaceDto() {
    }

    public AvaliacaoInterfaceDto(UUID idAvaliacao, String titulo, boolean statusAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.tituloAvaliacao = titulo;
        this.tipo = statusAvaliacao ? "Ativa" : "Inativa";
    }

    public static AvaliacaoInterfaceDto toAvaliacaoDto(AvaliacaoPersistenceEntity avaliacaoPersistenceEntity) {
        return new AvaliacaoInterfaceDto(
                avaliacaoPersistenceEntity.getIdAvaliacao(),
                avaliacaoPersistenceEntity.getTitulo(),
                avaliacaoPersistenceEntity.getStatusAvaliacao());

    }

    public UUID getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getTituloAvaliacao() {
        return tituloAvaliacao;
    }

    public String getTipo() {
        return tipo;
    }
}
