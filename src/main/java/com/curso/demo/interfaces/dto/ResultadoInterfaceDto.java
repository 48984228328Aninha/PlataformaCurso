package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.ResultadoPersistenceEntity;

public class ResultadoInterfaceDto {
    /*
     * private Long idResultado;
     * private String usuario;
     * private String avaliacao;
     * private Double notaObtida;
     * private Timestamp dataSubmissao;
     * private String feedback;
     */

    private Long idResultado;
    private Double notaObtida;
    private String usuario;

    public ResultadoInterfaceDto(Long idResultado, Double notaObtida, String usuario) {
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

    public Long getIdResultado() {
        return idResultado;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }

    public String getUsuario() {
        return usuario;
    }
}
