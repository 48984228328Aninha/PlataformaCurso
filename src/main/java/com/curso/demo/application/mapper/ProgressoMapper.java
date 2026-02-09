package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Progresso;
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
}
