package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.UsuarioPersistenceEntity;

public class UsuarioInterfaceDto {
    private String username;
    private String password;
    private String email;

    public UsuarioInterfaceDto(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public static UsuarioInterfaceDto toUsuarioDto(UsuarioPersistenceEntity usuarioPersistenceEntity) {
        return new UsuarioInterfaceDto(
                usuarioPersistenceEntity.getSenhaUsuario(),
                null,
                usuarioPersistenceEntity.getEmailUsuario());
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
