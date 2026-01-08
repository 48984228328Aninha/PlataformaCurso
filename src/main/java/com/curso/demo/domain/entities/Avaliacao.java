package com.curso.demo.domain.entities;

public class Avaliacao {

    private Long idAvaliacao;
    private String titulo;
    private String tipo;
    private String disciplinaRelacionada;
    private double notaMaxima;
    private double notaMinimaAprovacao;
    private int quantidadeTentativas;
    private int tempoLimite;
    private String statusAvaliacao;
    private boolean status;

    public Avaliacao() {
    }

    public Avaliacao(Long idAvaliacao, String titulo, String tipo, String disciplinaRelacionada,
            double notaMaxima, double notaMinimaAprovacao, int quantidadeTentativas,
            int tempoLimite, String statusAvaliacao, boolean status) {
        this.idAvaliacao = idAvaliacao;
        this.titulo = titulo;
        this.tipo = tipo;
        this.disciplinaRelacionada = disciplinaRelacionada;
        this.notaMaxima = notaMaxima;
        this.notaMinimaAprovacao = notaMinimaAprovacao;
        this.quantidadeTentativas = quantidadeTentativas;
        this.tempoLimite = tempoLimite;
        this.statusAvaliacao = statusAvaliacao;
        this.status = status;
    }

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDisciplinaRelacionada() {
        return disciplinaRelacionada;
    }

    public double getNotaMaxima() {
        return notaMaxima;
    }

    public double getNotaMinimaAprovacao() {
        return notaMinimaAprovacao;
    }

    public int getQuantidadeTentativas() {
        return quantidadeTentativas;
    }

    public int getTempoLimite() {
        return tempoLimite;
    }

    public String getStatusAvaliacao() {
        return statusAvaliacao;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
