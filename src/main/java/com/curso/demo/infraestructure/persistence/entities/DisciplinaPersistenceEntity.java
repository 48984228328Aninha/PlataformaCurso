package com.curso.demo.infraestructure.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplinas")
public class DisciplinaPersistenceEntity {
    @Id
    private UUID idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;

    public DisciplinaPersistenceEntity() {
    }

    public DisciplinaPersistenceEntity(UUID idDisciplina, String nomeDisciplina, String descricaoDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
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
