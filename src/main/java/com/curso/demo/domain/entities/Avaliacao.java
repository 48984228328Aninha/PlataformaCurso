package com.curso.demo.domain.entities;

public class Avaliacao {

    private Long idAvaliacao;
    private String tituloAvaliacao;
    private String tipo;
    private String disciplinaRelacionada;
    private double notaMaxima;
    private double notaMinimaAprovacao;
    private int quantidadeTentativas;
    private int tempoLimite;
    private boolean statusAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(Long idAvaliacao, String tituloAvaliacao, String tipo, String disciplinaRelacionada,
            double notaMaxima, double notaMinimaAprovacao, int quantidadeTentativas,
            int tempoLimite, boolean statusAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.tituloAvaliacao = tituloAvaliacao;
        this.tipo = tipo;
        this.disciplinaRelacionada = disciplinaRelacionada;
        this.notaMaxima = notaMaxima;
        this.notaMinimaAprovacao = notaMinimaAprovacao;
        this.quantidadeTentativas = quantidadeTentativas;
        this.tempoLimite = tempoLimite;
        this.statusAvaliacao = statusAvaliacao;
    }

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getTitulo() {
        return tituloAvaliacao;
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

    public boolean getStatusAvaliacao() {
        return statusAvaliacao;
    }

    public void setStatusAvaliacao(boolean statusAvaliacao) {
        this.statusAvaliacao = statusAvaliacao;
    }

}
