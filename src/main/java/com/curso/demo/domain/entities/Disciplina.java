package com.curso.demo.domain.entities;

import java.util.UUID;

public class Disciplina {

    private UUID idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;
    private int cargaHoraria;

    public Disciplina() {
    }

    public Disciplina(UUID idDisciplina, String nomeDisciplina, String descricaoDisciplina, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public UUID getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getDescricao() {
        return descricaoDisciplina;
    }

    public void setDescricao(String descricao) {
        this.descricaoDisciplina = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
