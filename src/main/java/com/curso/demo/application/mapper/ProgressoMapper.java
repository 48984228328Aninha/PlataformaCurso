package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.infraestructure.persistence.entities.ProgressoPersistenceEntity;
import com.curso.demo.interfaces.dto.ProgressoInterfaceDto;

public class ProgressoMapper {
    public static Progresso toDomain(ProgressoInterfaceDto progressoInterfaceDto) {
        return new Progresso(
                progressoInterfaceDto.getIdProgresso(),
                progressoInterfaceDto.getAulasConcluidas(),
                0,
                0,
                progressoInterfaceDto.getUltimaAtividadeRealizada());
    }

    public static ProgressoInterfaceDto toProgressoDto(Progresso progresso) {
        return new ProgressoInterfaceDto(
                progresso.getIdProgresso(),
                progresso.getAulasConcluidas(),
                progresso.getUltimaAtividadeRealizada());
    }

    public static ProgressoInterfaceDto toProgressoDto(ProgressoPersistenceEntity progressoPersistenceEntity) {
        return new ProgressoInterfaceDto(
                progressoPersistenceEntity.getIdProgresso(),
                progressoPersistenceEntity.getAulasConcluidas(),
                progressoPersistenceEntity.getUltimaAtividadeRealizada());
    }

    public static Progresso toDomain(ProgressoPersistenceEntity progressoPersistenceEntity) {
        return new Progresso(
                progressoPersistenceEntity.getIdProgresso(),
                progressoPersistenceEntity.getAulasConcluidas(),
                progressoPersistenceEntity.getUltimaAtividadeRealizada());
    }

    public static ProgressoPersistenceEntity toEntity(Progresso progresso) {
        return new ProgressoPersistenceEntity(
                progresso.getIdProgresso(),
                progresso.getAulasConcluidas(),
                progresso.getUltimaAtividadeRealizada());
    }

    public static Progresso toProgressoDto(ProgressoInterfaceDto progressoInterfaceDto) {
        return new Progresso(
                progressoInterfaceDto.getIdProgresso(),
                progressoInterfaceDto.getAulasConcluidas(),
                progressoInterfaceDto.getUltimaAtividadeRealizada());
    }
}
