package com.curso.demo.infraestructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class MatriculaPersistenceEntity {
    @Id
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
