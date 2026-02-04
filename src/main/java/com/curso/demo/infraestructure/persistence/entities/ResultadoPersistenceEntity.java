package com.curso.demo.infraestructure.persistence.entities;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultado")
public class ResultadoPersistenceEntity {

    @Id
    private Long idResultado;
    private String usuario;
    private String avaliacao;
    private Double notaObtida;
    private Timestamp dataSubmissao;
    private String feedback;

    public ResultadoPersistenceEntity() {
    }

    public ResultadoPersistenceEntity(Long idResultado, String usuario, String avaliacao, Double notaObtida,
            Timestamp dataSubmissao, String feedback) {
        this.idResultado = idResultado;
        this.usuario = usuario;
        this.avaliacao = avaliacao;
        this.notaObtida = notaObtida;
        this.dataSubmissao = dataSubmissao;
        this.feedback = feedback;
    }

    public Long getIdResultado() {
        return idResultado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Timestamp getDataSubmissao() {
        return dataSubmissao;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }
}
