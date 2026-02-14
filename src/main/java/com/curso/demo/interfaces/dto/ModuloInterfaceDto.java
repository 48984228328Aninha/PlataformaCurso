package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.ModuloPersistenceEntity;

public class ModuloInterfaceDto {
    private UUID idModulo;
    private String tituloModulo;
    private String descricaoModulo;

    public ModuloInterfaceDto(UUID idModulo, String tituloModulo, String descricaoModulo) {
        this.idModulo = idModulo;
        this.tituloModulo = tituloModulo;
        this.descricaoModulo = descricaoModulo;
    }

    public static ModuloInterfaceDto toModuloDto(ModuloPersistenceEntity moduloPersistenceEntity) {
        return new ModuloInterfaceDto(
                moduloPersistenceEntity.getIdModulo(),
                moduloPersistenceEntity.getTituloModulo(),
                moduloPersistenceEntity.getDescricaoModulo());
    }

    public UUID getIdModulo() {
        return idModulo;
    }

    public String getTituloModulo() {
        return tituloModulo;
    }

    public void setTituloModulo(String tituloModulo) {
        this.tituloModulo = tituloModulo;
    }

    public String getDescricaoModulo() {
        return descricaoModulo;
    }

    public void setDescricaoModulo(String descricaoModulo) {
        this.descricaoModulo = descricaoModulo;
    }

}
