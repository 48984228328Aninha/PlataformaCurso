package com.curso.demo.domain.entities;

public class Modulo {

    /*
     * Id do Módulo
     * 
     * Título
     * 
     * Descrição
     * 
     * Ordem dentro do curso
     * 
     * Curso relacionado
     * 
     * Carga horária do módulo
     * 
     * Status (ativo/inativo)
     */

    private Long idModulo;
    private String titulo;
    private String descricaoModulo;
    private int ordemModulo;
    private String cursoRelacionado;
    private int cargaHoraria;
    private String statusModulo;

    public Modulo() {
    }

    public Modulo(Long idModulo, String titulo, String descricaoModulo, int ordemModulo,
            String cursoRelacionado, int cargaHoraria, String statusModulo) {
        this.idModulo = idModulo;
        this.titulo = titulo;
        this.descricaoModulo = descricaoModulo;
        this.ordemModulo = ordemModulo;
        this.cursoRelacionado = cursoRelacionado;
        this.cargaHoraria = cargaHoraria;
        this.statusModulo = statusModulo;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricaoModulo() {
        return descricaoModulo;
    }

    public int getOrdemModulo() {
        return ordemModulo;
    }

    public String getCursoRelacionado() {
        return cursoRelacionado;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getStatusModulo() {
        return statusModulo;
    }
}
