package com.curso.demo.interfaces.dto;

public class ProgressoInterfaceDto {
    private Long idProgresso;
    private String aulasConcluidas;
    private String ultimaAtividadeRealizada;

    public ProgressoInterfaceDto(Long idProgresso, String aulasConcluidas, String ultimaAtividadeRealizada) {
        this.idProgresso = idProgresso;
        this.aulasConcluidas = aulasConcluidas;
        this.ultimaAtividadeRealizada = ultimaAtividadeRealizada;
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
