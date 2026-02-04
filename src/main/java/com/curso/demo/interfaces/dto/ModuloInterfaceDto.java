package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.ModuloPersistenceEntity;

public class ModuloInterfaceDto {
    private Long idModulo;
    private String tituloModulo;
    private String descricaoModulo;

    public ModuloInterfaceDto(Long idModulo, String tituloModulo, String descricaoModulo) {
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

    public Long getIdModulo() {
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
