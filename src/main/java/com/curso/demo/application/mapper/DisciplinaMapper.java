package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.infraestructure.persistence.entities.DisciplinaPersistenceEntity;
import com.curso.demo.interfaces.dto.DisciplinaInterfaceDto;

public class DisciplinaMapper {

    public static DisciplinaInterfaceDto toDisciplinaDto(Disciplina disciplina) {
        return new DisciplinaInterfaceDto(
                disciplina.getIdDisciplina(),
                disciplina.getNomeDisciplina(),
                disciplina.getDescricao());
    }

    public static DisciplinaInterfaceDto toDisciplinaDto(DisciplinaPersistenceEntity disciplinaPersistenceEntity) {
        return new DisciplinaInterfaceDto(
                disciplinaPersistenceEntity.getIdDisciplina(),
                disciplinaPersistenceEntity.getNomeDisciplina(),
                disciplinaPersistenceEntity.getDescricaoDisciplina());
    }

    public static DisciplinaInterfaceDto toDisciplina(Disciplina disciplina) {
        return new DisciplinaInterfaceDto(
                disciplina.getIdDisciplina(),
                disciplina.getNomeDisciplina(),
                disciplina.getDescricao());
    }

    public static Disciplina toDomain(DisciplinaPersistenceEntity disciplinaPersistenceEntity) {
        return new Disciplina(
                disciplinaPersistenceEntity.getIdDisciplina(),
                disciplinaPersistenceEntity.getNomeDisciplina(),
                disciplinaPersistenceEntity.getDescricaoDisciplina());
    }

    public static DisciplinaPersistenceEntity toEntity(Disciplina disciplina) {
        return new DisciplinaPersistenceEntity(
                disciplina.getIdDisciplina(),
                disciplina.getNomeDisciplina(),
                disciplina.getDescricao());
    }

    public static Disciplina toDomain(DisciplinaInterfaceDto disciplinaInterfaceDto) {
        return new Disciplina(
                disciplinaInterfaceDto.getIdDisciplina(),
                disciplinaInterfaceDto.getNomeDisciplina(),
                disciplinaInterfaceDto.getDescricaoDisciplina());
    }
}
