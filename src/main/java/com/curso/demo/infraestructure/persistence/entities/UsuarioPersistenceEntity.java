package com.curso.demo.infraestructure.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioPersistenceEntity {
    @Id
    private UUID idUsuario;
    private String usuarioNome;
    private String emailUsuario;
    private String senhaUsuario;

    public UsuarioPersistenceEntity() {
    }

    public UsuarioPersistenceEntity(UUID idUsuario, String usuarioNome, String emailUsuario, String senhaUsuario) {
        this.idUsuario = idUsuario;
        this.usuarioNome = usuarioNome;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
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
