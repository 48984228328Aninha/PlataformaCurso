package com.curso.demo.interfaces.dto;

import com.curso.demo.infraestructure.persistence.entities.MatriculaPersistenceEntity;

public class MatriculaAvaliacaoDto {
    private String cursoNome;
    private String usuarioMatriculaDto;

    public MatriculaAvaliacaoDto(String cursoNome, String usuarioMatriculadoDto) {
        this.cursoNome = cursoNome;
        this.usuarioMatriculaDto = usuarioMatriculadoDto;
    }

    public MatriculaAvaliacaoDto() {
    }

    public static MatriculaAvaliacaoDto toMatriculaDto(MatriculaPersistenceEntity matriculaPersistence) {
        return new MatriculaAvaliacaoDto(
                matriculaPersistence.getCurso(),
                matriculaPersistence.getUsuario()

        );
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
