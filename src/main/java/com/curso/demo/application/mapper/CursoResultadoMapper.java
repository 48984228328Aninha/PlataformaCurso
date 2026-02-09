package com.curso.demo.application.mapper;

import com.curso.demo.domain.entities.Curso;
import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;
import com.curso.demo.interfaces.dto.CursoInterfaceDto;

/*private String nomeCurso;
    private UUID idCurso;
    private String categoriaCurso;
    private String descricaoCurso;
    private String objetivoCurso;
    private String tituloCurso;
    private String publicoAlvo;
    private String nivel;
    private String cargaHoraria;
    private String idioma;
    private String status;
    private String instrutorResponsavel;
    private Timestamp dataCriacao;
    private Timestamp dataPublicacao;
    private Timestamp dataAtualizacao;
    private String avaliacaoMedia;
    private int quantidadeAlunos;
    private String requisitosPrevios;
    private boolean certificadoDisponivel; */

/*private UUID idCurso;
private String nomeCursoInterface;
private String descricaoCursoInterface; */

public class CursoResultadoMapper {
    public static Curso toDomain(CursoInterfaceDto cursoInterfaceDto) {
        return new Curso(
                cursoInterfaceDto.getNomeCursoInterface(),
                cursoInterfaceDto.getIdCurso(),
                "",
                cursoInterfaceDto.getDescricaoCursoInterface(),
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "");
    }

    public static CursoInterfaceDto toCursoDto(Curso curso) {
        return new CursoInterfaceDto(
                curso.getId(),
                curso.getNome(),
                curso.getAvaliacaoMedia());
    }

    public static CursoInterfaceDto toCursoDto(CursoPersistenceEntity cursoPersistenceEntity) {
        return new CursoInterfaceDto(
                cursoPersistenceEntity.getId(),
                cursoPersistenceEntity.getNome(),
                cursoPersistenceEntity.getDescricao());
    }

    public static CursoInterfaceDto toDto(Curso curso) {
        return new CursoInterfaceDto(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao());
    }
}
