package com.curso.demo.application.mapper;

import java.sql.Timestamp;
import java.util.UUID;

import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.infraestructure.persistence.entities.UsuarioPersistenceEntity;
import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

public class UsuarioMapper {

    public static Usuario toDomain(UsuarioInterfaceDto dto, String senhaCriptografada,
            Usuario.UsuarioRole role, String status, Progresso progresso) {
        return new Usuario(
                UUID.randomUUID(),
                dto.getUsername(),
                dto.getEmail(),
                senhaCriptografada,
                role,
                dto.getUsername(),
                status,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                null,
                "pt-BR",
                null,
                progresso);
    }

    public static UsuarioInterfaceDto toUsuarioDto(Usuario usuario) {
        return new UsuarioInterfaceDto(
                usuario.getUsername(),
                null,
                usuario.getEmail());
    }

    public static UsuarioInterfaceDto toUsuarioDto(UsuarioPersistenceEntity dto) {
        return new UsuarioInterfaceDto(
                dto.getUsuarioNome(),
                null,
                dto.getEmailUsuario());

    }

    public static Usuario toDomain(UsuarioPersistenceEntity usuarioPersistenceEntity) {
        return new Usuario(
                usuarioPersistenceEntity.getIdUsuario(),
                usuarioPersistenceEntity.getUsuarioNome(),
                usuarioPersistenceEntity.getEmailUsuario(),
                usuarioPersistenceEntity.getSenhaUsuario());
    }

    public static UsuarioPersistenceEntity toEntity(Usuario usuario) {
        return new UsuarioPersistenceEntity(
                usuario.getIdUsuario(),
                usuario.getUsername(),
                usuario.getEmail(),
                usuario.getPassword());
    }
}
