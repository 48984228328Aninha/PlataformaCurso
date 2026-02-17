package com.curso.demo.domain.entities;

import java.util.UUID;

public class Progresso {

    private UUID idProgresso;
    private String aulasConcluidas;
    private int totalAulas;
    private int tempoTotalEstudado;
    private String ultimaAtividadeRealizada;

    public Progresso() {
    }

    public Progresso(UUID idProgresso, String aulasConcluidas, int totalAulas, int tempoTotalEstudado,
            String ultimaAtividadeRealizada) {
        this.idProgresso = idProgresso;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulas = totalAulas;
        this.tempoTotalEstudado = tempoTotalEstudado;
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }

    public Progresso(UUID idProgresso, String aulasConcluidas, String ultimaAtividadeRealizada) {
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

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    public int getTempoTotalEstudado() {
        return tempoTotalEstudado;
    }

    public void setTempoTotalEstudado(int tempoTotalEstudado) {
        this.tempoTotalEstudado = tempoTotalEstudado;
    }

    public String getUltimaAtividadeRealizada() {
        return ultimaAtividadeRealizada;
    }

    public void setUltimaAtividadeRealizada(String ultimaAtividadeRealizada) {
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }

}
