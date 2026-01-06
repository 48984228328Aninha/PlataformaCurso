package com.curso.demo.infraestructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class RolePersistenceEntity {
    @Id
    private Long idRole;
    private String nomeRole;

    public RolePersistenceEntity() {
    }

    public RolePersistenceEntity(Long idRole, String nomeRole) {
        this.idRole = idRole;
        this.nomeRole = nomeRole;
    }

    public Long getIdRole() {
        return idRole;
    }

    public String getNomeRole() {
        return nomeRole;
    }

    public void setNomeRole(String nomeRole) {
        this.nomeRole = nomeRole;
    }
}
