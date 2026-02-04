package com.curso.demo.infraestructure.persistence.entities;

public class CertificadoPersistenceEntity {

    private String aulasConcluidas;
    private int totalAulasCertificado;
    private int tempoTotalEstudado;

    public CertificadoPersistenceEntity() {
    }

    public CertificadoPersistenceEntity(String aulasConcluidas, int totalAulasCertificado, int tempoTotalEstudado) {
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulasCertificado = totalAulasCertificado;
        this.tempoTotalEstudado = tempoTotalEstudado;
    }

    public String getAulasConcluidas() {
        return aulasConcluidas;
    }

    public void setAulasConcluidas(String aulasConcluidas) {
        this.aulasConcluidas = aulasConcluidas;
    }

    public int getTotalAulasCertificado() {
        return totalAulasCertificado;
    }

    public void setTotalAulasCertificado(int totalAulasCertificado) {
        this.totalAulasCertificado = totalAulasCertificado;
    }

    public int getTempoTotalEstudado() {
        return tempoTotalEstudado;
    }
}
