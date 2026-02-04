package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.ProgressoPersistenceEntity;

public class ProgressoInterfaceDto {
    private Long idProgresso;
    private String aulasConcluidas;
    private String ultimaAtividadeRealizada;

    public ProgressoInterfaceDto(Long idProgresso, String aulasConcluidas, String ultimaAtividadeRealizada) {
        this.idProgresso = idProgresso;
        this.aulasConcluidas = aulasConcluidas;
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }

    public static ProgressoInterfaceDto toProgressoDto(ProgressoPersistenceEntity progressoPersistenceEntity) {
        return new ProgressoInterfaceDto(
                progressoPersistenceEntity.getIdProgresso(),
                progressoPersistenceEntity.getAulasConcluidas(),
                progressoPersistenceEntity.getUltimaAtividadeRealizada());
    }

    public Long getIdProgresso() {
        return idProgresso;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public String getUltimaAtividadeRealizada() {
        return ultimaAtividadeRealizada;
    }

}
