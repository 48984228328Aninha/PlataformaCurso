package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Curso;
import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;
import com.curso.demo.interfaces.dto.CursoInterfaceDto;

public class CursoResultadoMapper {

    public static CursoInterfaceDto toCursoDto(Curso curso) {
        return new CursoInterfaceDto(
                curso.getId(),
                curso.getNome(),
                curso.getAvaliacaoMedia());
    }

    public static CursoInterfaceDto toCursoDto(CursoPersistenceEntity cursoPersistenceEntity) {
        return new CursoInterfaceDto(
                cursoPersistenceEntity.getId(),
                cursoPersistenceEntity.getNome(),
                cursoPersistenceEntity.getDescricao());
    }

    public static CursoInterfaceDto toDomain(Curso curso) {
        return new CursoInterfaceDto(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao());
    }

    public static Curso toDomain(CursoPersistenceEntity cursoPersistenceEntity) {
        return new Curso(
                cursoPersistenceEntity.getId(),
                cursoPersistenceEntity.getNome(),
                cursoPersistenceEntity.getDescricao());
    }

    public static CursoPersistenceEntity toEntity(Curso curso) {
        return new CursoPersistenceEntity(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao());
    }

    public static Curso toDomain(CursoInterfaceDto cursoInterfaceDto) {
        return new Curso(
                cursoInterfaceDto.getIdCurso(),
                cursoInterfaceDto.getNomeCursoInterface(),
                cursoInterfaceDto.getDescricaoCursoInterface());
    }
}
