package com.curso.demo.domain.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Curso {
    // atributos de curso, as características
    private String nome;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private UUID id;
    private String categoria;
    private String descricao;

    // construtor da classe serve para o objeto ser instanciado
    public Curso() {
    }

    // quando eu quiser criar um curso, eu preciso colocar as informações
    // que estão dentro de Curso embaixo
    public Curso(String nome, UUID id, String categoria, String descricao) {
        this.nome = nome;
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    // por meio dessa função getNome eu consigo pegar o nome do curso
    public String getNome() {
        return nome;
    }

    // aqui eu consigo colocar o nome do curso e mudar
    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
