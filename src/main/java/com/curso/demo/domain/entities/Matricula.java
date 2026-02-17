package com.curso.demo.domain.entities;

import java.security.Timestamp;
import java.util.UUID;

public class Matricula {

    private UUID idMatricula;
    private String usuario;
    private String curso;
    private String statusMatricula;
    private String dataMatricula;
    private Timestamp dataInicio;
    private Timestamp dataConclusao;
    private String progressoGeral;
    private String ultimaAulaAcessada;

    public Matricula() {
    }

    public Matricula(UUID idMatricula, String usuario, String curso, String statusMatricula,
            String dataMatricula, Timestamp dataInicio, Timestamp dataConclusao,
            String progressoGeral, String ultimaAulaAcessada) {
        this.idMatricula = idMatricula;
        this.usuario = usuario;
        this.curso = curso;
        this.statusMatricula = statusMatricula;
        this.dataMatricula = dataMatricula;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.progressoGeral = progressoGeral;
        this.ultimaAulaAcessada = ultimaAulaAcessada;
    }

    public Matricula(UUID idMatricula, String curso, String dataMatricula, String usuario) {
        this.idMatricula = idMatricula;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.usuario = usuario;
    }

    public Matricula(UUID idMatricula, String curso, String usuario) {
        this.idMatricula = idMatricula;
        this.curso = curso;
        this.usuario = usuario;
    }

    public UUID getIdMatricula() {
        return idMatricula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataConclusao(Timestamp dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Timestamp getDataConclusao() {
        return dataConclusao;
    }

    public void setProgressoGeral(String progressoGeral) {
        this.progressoGeral = progressoGeral;
    }

    public String getProgressoGeral() {
        return progressoGeral;
    }

    public void setUltimaAulaAcessada(String ultimaAulaAcessada) {
        this.ultimaAulaAcessada = ultimaAulaAcessada;
    }

    public String getUltimaAulaAcessada() {
        return ultimaAulaAcessada;
    }
}
