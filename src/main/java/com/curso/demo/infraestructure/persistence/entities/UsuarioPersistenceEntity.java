package com.curso.demo.infraestructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioPersistenceEntity {
    @Id
    private Long idUsuario;
    private String usuarioNome;
    private String emailUsuario;

    public UsuarioPersistenceEntity() {
    }

    public UsuarioPersistenceEntity(Long idUsuario, String usuarioNome, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.usuarioNome = usuarioNome;
        this.emailUsuario = emailUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
