package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.ResultadoPersistenceEntity;

public class ResultadoInterfaceDto {

    private UUID idResultado;
    private Double notaObtida;
    private String usuario;

    public ResultadoInterfaceDto(UUID idResultado, Double notaObtida, String usuario) {
        this.idResultado = idResultado;
        this.notaObtida = notaObtida;
        this.usuario = usuario;
    }

    public static ResultadoInterfaceDto toResultadoDto(ResultadoPersistenceEntity resultadoPersistenceEntity) {
        return new ResultadoInterfaceDto(
                resultadoPersistenceEntity.getIdResultado(),
                resultadoPersistenceEntity.getNotaObtida(),
                resultadoPersistenceEntity.getUsuario());

    }

    public UUID getIdResultado() {
        return idResultado;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }

    public String getUsuario() {
        return usuario;
    }
}
