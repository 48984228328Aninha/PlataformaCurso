package com.curso.demo.infraestructure.persistence.entities;

public class MatriculaPersistenceEntity {
    /*
     * private Long idMatricula;
     * private String usuario;
     * private String curso;
     * private String statusMatricula;
     * private String dataMatricula;
     * private Timestamp dataInicio;
     * private Timestamp dataConclusao;
     * private String progressoGeral;
     * private String ultimaAulaAcessada;
     */
    private Long idMatricula;
    private String curso;
    private String dataMatricula;
    private String usuario;

    public MatriculaPersistenceEntity() {
    }

    public MatriculaPersistenceEntity(Long idMatricula, String curso, String dataMatricula, String usuario) {
        this.idMatricula = idMatricula;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.usuario = usuario;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
