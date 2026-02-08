package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.infraestructure.persistence.entities.MatriculaPersistenceEntity;
import com.curso.demo.interfaces.dto.MatriculaInterfaceDto;

public class MatriculaMapper {

    public static Matricula toDomain(MatriculaInterfaceDto matriculaInterfaceDto) {
        return new Matricula(
                matriculaInterfaceDto.getIdMatricula(),
                matriculaInterfaceDto.getUsuarioMatriculaDto(),
                matriculaInterfaceDto.getCursoNome(),
                "",
                matriculaInterfaceDto.getUsuarioMatriculaDto(),
                null,
                null,
                "",
                "");
    }

    public static MatriculaInterfaceDto toMatriculaDto(Matricula matricula) {
        return new MatriculaInterfaceDto(
                matricula.getIdMatricula(),
                matricula.getCurso(),
                matricula.getUsuario());
    }

    public static MatriculaInterfaceDto toMatriculaDto(MatriculaPersistenceEntity matriculaPersistence) {
        return new MatriculaInterfaceDto(
                matriculaPersistence.getIdMatricula(),
                matriculaPersistence.getCurso(),
                matriculaPersistence.getUsuario());
    }
}