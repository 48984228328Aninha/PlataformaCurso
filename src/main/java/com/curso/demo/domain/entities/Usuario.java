package com.curso.demo.domain.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private UUID idUsuario;
    private String username;
    private String email;
    private String password;
    private UsuarioRole role;

    public Usuario() {
    }

    public Usuario(UUID idUsuario, String username, String email, String password, UsuarioRole role) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public enum UsuarioRole {
        ADMIN,
        STUDENT,
        INSTRUCTOR
    }

    public UsuarioRole getRole() {
        return role;
    }
}
