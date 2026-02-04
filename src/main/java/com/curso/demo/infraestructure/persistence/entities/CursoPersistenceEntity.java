package com.curso.demo.infraestructure.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class CursoPersistenceEntity {

    @Id
    private UUID id;

    private String nome;

    private String descricao;

    public CursoPersistenceEntity() {
    }

    public CursoPersistenceEntity(UUID id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
