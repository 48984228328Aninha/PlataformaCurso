package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.ProgressoPersistenceEntity;

public class ProgressoInterfaceDto {
    private UUID idProgresso;
    private String aulasConcluidas;
    private String ultimaAtividadeRealizada;

    public ProgressoInterfaceDto(UUID idProgresso, String aulasConcluidas, String ultimaAtividadeRealizada) {
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

    public UUID getIdProgresso() {
        return idProgresso;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public String getUltimaAtividadeRealizada() {
        return ultimaAtividadeRealizada;
    }

}
