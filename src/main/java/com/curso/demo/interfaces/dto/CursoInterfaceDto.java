package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;

public class CursoInterfaceDto {

    private String nomeCursoInterface;
    private String descricaoCursoInterface;

    public CursoInterfaceDto() {
    }

    public CursoInterfaceDto(String nomeCursoInterface, String descricaoCursoInterface) {
        this.nomeCursoInterface = nomeCursoInterface;
        this.descricaoCursoInterface = descricaoCursoInterface;
    }

    public static CursoInterfaceDto toCursoDto(CursoPersistenceEntity cursoPersistence) {
        return new CursoInterfaceDto(
                cursoPersistence.getNome(),
                cursoPersistence.getDescricao());

    }

    public String getNomeCursoInterface() {
        return nomeCursoInterface;
    }

    public void setNomeCursoInterface(String nomeCursoInterface) {
        this.nomeCursoInterface = nomeCursoInterface;
    }

    public String getDescricaoCursoInterface() {
        return descricaoCursoInterface;
    }

    public void setDescricaoCursoInterface(String descricaoCursoInterface) {
        this.descricaoCursoInterface = descricaoCursoInterface;
    }

}
