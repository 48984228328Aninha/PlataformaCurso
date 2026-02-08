package com.curso.demo.interfaces.dto;

import java.util.UUID;

public class CertificadoInterfaceDto {
    private UUID idCertificado;
    private String aulasConcluidas;
    private int percentualConcluido;

    public CertificadoInterfaceDto() {
    }

    public CertificadoInterfaceDto(UUID idCertificado, String aulasConcluidas, int percentualConcluido) {
        this.idCertificado = idCertificado;
        this.aulasConcluidas = aulasConcluidas;
        this.percentualConcluido = percentualConcluido;
    }

    public UUID getIdCertificado() {
        return idCertificado;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public void setAulasConcluidas(String aulasConcluidas) {
        this.aulasConcluidas = aulasConcluidas;
    }

    public int getPercentualConcluido() {
        return percentualConcluido;
    }

}
