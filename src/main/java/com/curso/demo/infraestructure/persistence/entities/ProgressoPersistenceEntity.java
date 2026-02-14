package com.curso.demo.infraestructure.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "progresso")
public class ProgressoPersistenceEntity {
    @Id
    private UUID idProgresso;
    private String aulasConcluidas;
    private String ultimaAtividadeRealizada;

    public ProgressoPersistenceEntity() {
    }

    public ProgressoPersistenceEntity(UUID idProgresso, String aulasConcluidas, String ultimaAtividadeRealizada) {
        this.idProgresso = idProgresso;
        this.aulasConcluidas = aulasConcluidas;
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }

    public UUID getIdProgresso() {
        return idProgresso;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public void setAulasConcluidas(String aulasConcluidas) {
        this.aulasConcluidas = aulasConcluidas;
    }

    public String getUltimaAtividadeRealizada() {
        return ultimaAtividadeRealizada;
    }

    public void setUltimaAtividadeRealizada(String ultimaAtividadeRealizada) {
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }
}
