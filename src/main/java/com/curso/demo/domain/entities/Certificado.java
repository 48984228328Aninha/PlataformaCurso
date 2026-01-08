package com.curso.demo.domain.entities;

public class Certificado {

    private Long idCertificado;
    private int percentualConcluido;
    private String aulasConcluidas;
    private int totalAulasCertificado;
    private int tempoTotalEstudado;

    public Certificado() {
    }

    public Certificado(Long idCertificado, int percentualConcluido, String aulasConcluidas, int totalAulasCertificado,
            int tempoTotalEstudado) {
        this.idCertificado = idCertificado;
        this.percentualConcluido = percentualConcluido;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulasCertificado = totalAulasCertificado;
        this.tempoTotalEstudado = tempoTotalEstudado;
    }

    public Long getIdCertificado() {
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