package com.curso.demo.interfaces.dto;

import java.util.UUID;

import com.curso.demo.infraestructure.persistence.entities.MatriculaPersistenceEntity;

public class MatriculaInterfaceDto {
    private UUID idMatricula;
    private String cursoNome;
    private String usuarioMatriculaDto;

    public MatriculaInterfaceDto(UUID idMatricula, String cursoNome, String usuarioMatriculaDto) {
        this.idMatricula = idMatricula;
        this.cursoNome = cursoNome;
        this.usuarioMatriculaDto = usuarioMatriculaDto;
    }

    public MatriculaInterfaceDto() {
    }

    public static MatriculaInterfaceDto toMatriculaDto(MatriculaPersistenceEntity matriculaPersistence) {
        return new MatriculaInterfaceDto(
                matriculaPersistence.getIdMatricula(),
                matriculaPersistence.getCurso(),
                matriculaPersistence.getUsuario());
    }

    public UUID getIdMatricula() {
        return idMatricula;
    }

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public String getUsuarioMatriculaDto() {
        return usuarioMatriculaDto;
    }

    public void setUsuarioMatriculaDto(String usuarioMatriculaDto) {
        this.usuarioMatriculaDto = usuarioMatriculaDto;
    }

}
