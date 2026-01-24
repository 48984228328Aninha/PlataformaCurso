package com.curso.demo.domain.entities;

import java.security.Timestamp;

public class Resultado {
    private Long idResultado;
    private String usuario;
    private String avaliacao;
    private Double notaObtida;
    private String status;
    private Timestamp dataSubmissao;
    private int tentativa;
    private String feedback;

    public Resultado() {
    }

    public Resultado(Long idResultado, String usuario, String avaliacao, Double notaObtida,
            String status, Timestamp dataSubmissao, int tentativa, String feedback) {
        this.idResultado = idResultado;
        this.usuario = usuario;
        this.avaliacao = avaliacao;
        this.notaObtida = notaObtida;
        this.status = status;
        this.dataSubmissao = dataSubmissao;
        this.tentativa = tentativa;
        this.feedback = feedback;
    }

    public Long getIdResultado() {
        return idResultado;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }

    public String getStatus() {
        return status;
    }

    public Timestamp getDataSubmissao() {
        return dataSubmissao;
    }

    public int getTentativa() {
        return tentativa;
    }

    public String getFeedback() {
        return feedback;
    }
}
