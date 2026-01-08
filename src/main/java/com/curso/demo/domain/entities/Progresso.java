package com.curso.demo.domain.entities;

public class Progresso {

    private Long idProgresso;
    private String aulasConcluidas;
    private int totalAulas;
    private int tempoTotalEstudado;
    private String ultimaAtividadeRealizada;

    public Progresso() {
    }

    public Progresso(Long idProgresso, String aulasConcluidas, int totalAulas, int tempoTotalEstudado,
            String ultimaAtividadeRealizada) {
        this.idProgresso = idProgresso;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulas = totalAulas;
        this.tempoTotalEstudado = tempoTotalEstudado;
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
    }

    public Long getIdProgresso() {
        return idProgresso;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public int getTempoTotalEstudado() {
        return tempoTotalEstudado;
    }

    public String getUltimaAtividadeRealizada() {
        return ultimaAtividadeRealizada;
    }

}
