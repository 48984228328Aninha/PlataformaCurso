package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;

public class CursoInterfaceDto {

    private UUID idCurso;
    private String nomeCursoInterface;
    private String descricaoCursoInterface;

    public CursoInterfaceDto() {
    }

    public CursoInterfaceDto(UUID idCurso, String nomeCursoInterface, String descricaoCursoInterface) {
        this.idCurso = idCurso;
        this.nomeCursoInterface = nomeCursoInterface;
        this.descricaoCursoInterface = descricaoCursoInterface;
    }

    public static CursoInterfaceDto toCursoDto(CursoPersistenceEntity cursoPersistence) {
        return new CursoInterfaceDto(
                cursoPersistence.getIdCurso(),
                cursoPersistence.getNome(),
                cursoPersistence.getDescricao());

    }

    public UUID getIdCurso() {
        return idCurso;
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
