package com.curso.demo.domain.entities;

import java.util.UUID;

public class Disciplina {

    private UUID idDisciplina;
    private String nomeDisciplina;
    private String descricao;
    private int cargaHoraria;

    public Disciplina() {
    }

    public Disciplina(UUID idDisciplina, String nomeDisciplina, String descricao, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public UUID getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
