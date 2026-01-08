package com.curso.demo.domain.entities;

import java.security.Timestamp;
import java.util.UUID;

public class Curso {

    private String nome;
    private UUID id;
    private String categoria;
    private String descricao;
    private String objetivo;
    private String titulo;
    private String publicoAlvo;
    private String nivel;
    private String cargaHoraria;
    private String idioma;
    private String status;
    private String instrutorResponsavel;
    private String dataCriacao;
    private Timestamp dataPublicacao;
    private Timestamp dataAtualizacao;
    private String avaliacaoMedia;
    private String quantidadeAlunos;
    private String requisitosPrevios;
    private boolean certificadoDisponivel;

    public Curso() {
    }

    public Curso(String nome, UUID id, String categoria, String descricao, String objetivo, String titulo,
            String publicoAlvo,
            String nivel, String cargaHoraria, String idioma, String status,
            String instrutorResponsavel, String dataCriacao, Timestamp dataPublicacao,
            Timestamp dataAtualizacao, String avaliacaoMedia, String quantidadeAlunos,
            String requisitosPrevios, boolean certificadoDisponivel) {
        this.nome = nome;
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.titulo = titulo;
        this.publicoAlvo = publicoAlvo;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
        this.idioma = idioma;
        this.status = status;
        this.instrutorResponsavel = instrutorResponsavel;
        this.dataCriacao = dataCriacao;
        this.dataPublicacao = dataPublicacao;
        this.dataAtualizacao = dataAtualizacao;
        this.avaliacaoMedia = avaliacaoMedia;
        this.quantidadeAlunos = quantidadeAlunos;
        this.requisitosPrevios = requisitosPrevios;
        this.certificadoDisponivel = certificadoDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstrutorResponsavel() {
        return instrutorResponsavel;
    }

    public void setInstrutorResponsavel(String instrutorResponsavel) {
        this.instrutorResponsavel = instrutorResponsavel;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Timestamp getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Timestamp dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Timestamp getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Timestamp dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(String avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public String getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(String quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getRequisitosPrevios() {
        return requisitosPrevios;
    }

    public void setRequisitosPrevios(String requisitosPrevios) {
        this.requisitosPrevios = requisitosPrevios;
    }

    public boolean getCertificadoDisponivel() {
        return certificadoDisponivel;
    }

    public void setCertificadoDisponivel(boolean certificadoDisponivel) {
        this.certificadoDisponivel = certificadoDisponivel;
    }

}
