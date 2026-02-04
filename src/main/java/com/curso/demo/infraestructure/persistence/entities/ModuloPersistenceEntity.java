package com.curso.demo.infraestructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modulo")
public class ModuloPersistenceEntity {

    @Id
    private Long idModulo;
    private String tituloModulo;
    private String descricaoModulo;
    private int cargaHorariaModulo;
    private String statusModulo;

    public ModuloPersistenceEntity() {
    }

    public ModuloPersistenceEntity(Long idModulo, String tituloModulo, String descricaoModulo, int cargaHorariaModulo,
            String statusModulo) {
        this.idModulo = idModulo;
        this.tituloModulo = tituloModulo;
        this.descricaoModulo = descricaoModulo;
        this.cargaHorariaModulo = cargaHorariaModulo;
        this.statusModulo = statusModulo;
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

    public int getCargaHorariaModulo() {
        return cargaHorariaModulo;
    }

    public void setCargaHorariaModulo(int cargaHorariaModulo) {
        this.cargaHorariaModulo = cargaHorariaModulo;
    }

    public String getStatusModulo() {
        return statusModulo;
    }

    public void setStatusModulo(String statusModulo) {
        this.statusModulo = statusModulo;
    }

}
