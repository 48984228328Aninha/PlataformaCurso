package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.DisciplinaPersistenceEntity;

public class DisciplinaInterfaceDto {
    private UUID idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;

    public DisciplinaInterfaceDto(UUID idDisciplina, String nomeDisciplina, String descricaoDisciplina) {
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

    public UUID getIdDisciplina() {
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
