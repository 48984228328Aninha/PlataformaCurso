package com.curso.demo.infraestructure.persistence.entities;

import jakarta.persistence.Entity;

@Entity
public class AvaliacaoPersistenceEntity {
    private Long idAvaliacao;
    private String titulo;
    private boolean statusAvaliacao;

    public AvaliacaoPersistenceEntity() {
    }

    public AvaliacaoPersistenceEntity(Long idAvaliacao, String titulo, boolean statusAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.statusAvaliacao = statusAvaliacao;
        this.titulo = titulo;
    }

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getStatusAvaliacao() {
        return statusAvaliacao;
    }

    public void setStatusAvaliacao(boolean statusAvaliacao) {
        this.statusAvaliacao = statusAvaliacao;
    }
}
