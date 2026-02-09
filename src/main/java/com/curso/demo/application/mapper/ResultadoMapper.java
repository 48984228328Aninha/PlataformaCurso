package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.infraestructure.persistence.entities.ResultadoPersistenceEntity;
import com.curso.demo.interfaces.dto.ResultadoInterfaceDto;

public class ResultadoMapper {
    public static ResultadoInterfaceDto toResultadoDto(Resultado resultado) {
        return new ResultadoInterfaceDto(
                resultado.getIdResultado(),
                resultado.getNotaObtida(),
                resultado.getUsuario());
    }

    public static Resultado toDomain(ResultadoInterfaceDto resultadoInterfaceDto) {
        return new Resultado(
                resultadoInterfaceDto.getIdResultado(),
                resultadoInterfaceDto.getUsuario(),
                null,
                resultadoInterfaceDto.getNotaObtida(),
                null,
                null,
                0,
                null);
    }

    public static ResultadoInterfaceDto toResultadoDto(ResultadoPersistenceEntity resultadoPersistenceEntity) {
        return new ResultadoInterfaceDto(
                resultadoPersistenceEntity.getIdResultado(),
                resultadoPersistenceEntity.getNotaObtida(),
                resultadoPersistenceEntity.getUsuario());
    }
}
