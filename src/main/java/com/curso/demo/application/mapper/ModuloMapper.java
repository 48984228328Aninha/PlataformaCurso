package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.infraestructure.persistence.entities.ModuloPersistenceEntity;
import com.curso.demo.interfaces.dto.ModuloInterfaceDto;

public class ModuloMapper {

    public static ModuloInterfaceDto toModuloDto(Modulo modulo) {
        return new ModuloInterfaceDto(
                modulo.getIdModulo(),
                modulo.getTitulo(),
                modulo.getDescricaoModulo());
    }

    public static ModuloInterfaceDto toModuloDto(ModuloPersistenceEntity moduloPersistenceEntity) {
        return new ModuloInterfaceDto(
                moduloPersistenceEntity.getIdModulo(),
                moduloPersistenceEntity.getTituloModulo(),
                moduloPersistenceEntity.getDescricaoModulo());
    }

    public static Modulo toDomain(ModuloPersistenceEntity moduloPersistenceEntity) {
        return new Modulo(
                moduloPersistenceEntity.getIdModulo(),
                moduloPersistenceEntity.getTituloModulo(),
                moduloPersistenceEntity.getDescricaoModulo(),
                moduloPersistenceEntity.getCargaHorariaModulo(),
                moduloPersistenceEntity.getStatusModulo());
    }

    public static ModuloPersistenceEntity toEntity(Modulo modulo) {
        return new ModuloPersistenceEntity(
                modulo.getIdModulo(),
                modulo.getTitulo(),
                modulo.getDescricaoModulo(),
                modulo.getCargaHoraria(),
                modulo.getStatusModulo());
    }

    public static Modulo toModuloDto(ModuloInterfaceDto moduloInterfaceDto) {
        return new Modulo(
                moduloInterfaceDto.getIdModulo(),
                moduloInterfaceDto.getTituloModulo(),
                moduloInterfaceDto.getDescricaoModulo());
    }
}
