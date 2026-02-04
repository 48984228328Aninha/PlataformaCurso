package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.DisciplinaPersistenceEntity;

public class DisciplinaInterfaceDto {
    private Long idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;

    public DisciplinaInterfaceDto(Long idDisciplina, String nomeDisciplina, String descricaoDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
    }

    public static DisciplinaInterfaceDto toDisciplinaDto(DisciplinaPersistenceEntity disciplinaPersistence) {
        return new DisciplinaInterfaceDto(
                disciplinaPersistence.getIdDisciplina(),
                disciplinaPersistence.getNomeDisciplina(),
                disciplinaPersistence.getDescricaoDisciplina());
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDescricaoDisciplina() {
        return descricaoDisciplina;
    }

    public void setDescricaoDisciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }
}
