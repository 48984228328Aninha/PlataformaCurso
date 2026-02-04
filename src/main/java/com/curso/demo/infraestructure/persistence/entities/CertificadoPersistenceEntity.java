package com.curso.demo.infraestructure.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "certificados")
public class CertificadoPersistenceEntity {

    @Id
    private UUID idCertificado;
    private String aulasConcluidas;
    private int totalAulasCertificado;
    private int tempoTotalEstudado;

    public CertificadoPersistenceEntity() {
    }

    public CertificadoPersistenceEntity(UUID idCertificado, String aulasConcluidas, int totalAulasCertificado,
            int tempoTotalEstudado) {
        this.idCertificado = idCertificado;
        this.aulasConcluidas = aulasConcluidas;
        this.totalAulasCertificado = totalAulasCertificado;
        this.tempoTotalEstudado = tempoTotalEstudado;
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
