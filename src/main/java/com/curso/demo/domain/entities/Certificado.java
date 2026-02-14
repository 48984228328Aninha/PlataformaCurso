package com.curso.demo.domain.entities;

import java.util.UUID;

public class Certificado {

    private UUID idCertificado;
    private int percentualConcluido;
    private String aulasConcluidas;
    private int totalAulasCertificado;
    private int tempoTotalEstudado;

    public Certificado() {
    }

    public Certificado(UUID idCertificado, int percentualConcluido, String aulasConcluidas, int totalAulasCertificado,
            int tempoTotalEstudado) {
        this.idCertificado = idCertificado;
        this.percentualConcluido = percentualConcluido;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulasCertificado = totalAulasCertificado;
        this.tempoTotalEstudado = tempoTotalEstudado;
    }

    public Certificado(UUID idCertificado, int percentualConcluido, String aulasConcluidas) {
        this.idCertificado = idCertificado;
        this.percentualConcluido = percentualConcluido;
        this.aulasConcluidas = aulasConcluidas;
    }

    public Certificado(UUID idCertificado, String aulasConcluidas, int totalAulasCertificado, int tempoTotalEstudado) {
        this.idCertificado = idCertificado;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulasCertificado = totalAulasCertificado;
        this.tempoTotalEstudado = tempoTotalEstudado;
    }

    public UUID getIdCertificado() {
        return idCertificado;
    }

    public int getPercentualConcluido() {
        return percentualConcluido;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public int getTotalAulasCertificado() {
        return totalAulasCertificado;
    }

    public int getTempoTotalEstudado() {
        return tempoTotalEstudado;
    }

}