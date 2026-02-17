package com.curso.demo.domain.entities;

import java.security.Timestamp;
import java.util.UUID;

public class Curso {

    private String nomeCurso;
    private UUID idCurso;
    private String categoriaCurso;
    private String descricaoCurso;
    private String objetivoCurso;
    private String tituloCurso;
    private String publicoAlvo;
    private String nivel;
    private String cargaHoraria;
    private String idioma;
    private String status;
    private String instrutorResponsavel;
    private Timestamp dataCriacao;
    private Timestamp dataPublicacao;
    private Timestamp dataAtualizacao;
    private String avaliacaoMedia;
    private int quantidadeAlunos;
    private String requisitosPrevios;
    private boolean certificadoDisponivel;

    public Curso() {
    }

    public Curso(String nomeCurso, UUID idCurso, String categoriaCurso, String descricaoCurso,
            String objetivoCurso, String tituloCurso, String publicoAlvo, String nivel,
            String cargaHoraria, String idioma, String status, String instrutorResponsavel) {
        this.nomeCurso = nomeCurso;
        this.idCurso = idCurso;
        this.categoriaCurso = categoriaCurso;
        this.descricaoCurso = descricaoCurso;
        this.objetivoCurso = objetivoCurso;
        this.tituloCurso = tituloCurso;
        this.publicoAlvo = publicoAlvo;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
        this.idioma = idioma;
        this.status = status;
        this.instrutorResponsavel = instrutorResponsavel;
    }

    public Curso(String nomeCurso, UUID idCurso, String categoriaCurso, String descricaoCurso, String objetivoCurso,
            String tituloCurso,
            String publicoAlvo,
            String nivel, String cargaHoraria, String idioma, String status,
            String instrutorResponsavel, Timestamp dataCriacao, Timestamp dataPublicacao,
            Timestamp dataAtualizacao, String avaliacaoMedia, int quantidadeAlunos,
            String requisitosPrevios, boolean certificadoDisponivel) {
        this.nomeCurso = nomeCurso;
        this.idCurso = idCurso;
        this.categoriaCurso = categoriaCurso;
        this.descricaoCurso = descricaoCurso;
        this.objetivoCurso = objetivoCurso;
        this.tituloCurso = tituloCurso;
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

    public Curso(UUID idCurso, String nomeCurso, String descricaoCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.descricaoCurso = descricaoCurso;
    }

    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public UUID getId() {
        return idCurso;
    }

    public void setId(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public String getCategoria() {
        return categoriaCurso;
    }

    public void setCategoria(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

    public String getDescricao() {
        return descricaoCurso;
    }

    public void setDescricao(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public String getObjetivo() {
        return objetivoCurso;
    }

    public void setObjetivo(String objetivoCurso) {
        this.objetivoCurso = objetivoCurso;
    }

    public String getTitulo() {
        return tituloCurso;
    }

    public void setTitulo(String tituloCurso) {
        this.tituloCurso = tituloCurso;
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

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
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

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
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
