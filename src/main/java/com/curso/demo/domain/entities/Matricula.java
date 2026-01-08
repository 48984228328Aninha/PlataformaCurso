package com.curso.demo.domain.entities;

import java.security.Timestamp;

public class Matricula {

    private Long idMatricula;
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

    public Matricula(Long idMatricula, String usuario, String curso, String statusMatricula,
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

    public Long getIdMatricula() {
        return idMatricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCurso() {
        return curso;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public Timestamp getDataConclusao() {
        return dataConclusao;
    }

    public String getProgressoGeral() {
        return progressoGeral;
    }

    public String getUltimaAulaAcessada() {
        return ultimaAulaAcessada;
    }
}
