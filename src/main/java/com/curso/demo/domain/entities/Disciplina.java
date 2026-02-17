package com.curso.demo.domain.entities;

import java.util.UUID;

public class Disciplina {

    private UUID idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;
    private int cargaHorariaDisciplina;

    public Disciplina() {
    }

    /*disciplina.getIdDisciplina(),
                disciplina.getNomeDisciplina(),
                disciplina.getDescricao()); */

    public Disciplina(UUID idDisciplina, String nomeDisciplina, String descricaoDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public Disciplina(UUID idDisciplina, String nomeDisciplina, String descricaoDisciplina,
            int cargaHorariaDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
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
        return cargaHorariaDisciplina;
    }

    public void setCargaHoraria(int cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }
}
