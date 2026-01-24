package com.curso.demo.domain.entities;

public class Modulo {
    private Long idModulo;
    private String tituloModulo;
    private String descricaoModulo;
    private int ordemModulo;
    private String cursoRelacionado;
    private int cargaHoraria;
    private String statusModulo;

    public Modulo() {
    }

    public Modulo(Long idModulo, String tituloModulo, String descricaoModulo, int ordemModulo,
            String cursoRelacionado, int cargaHoraria, String statusModulo) {
        this.idModulo = idModulo;
        this.tituloModulo = tituloModulo;
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
        return tituloModulo;
    }

    public void setTitulo(String tituloModulo) {
        this.tituloModulo = tituloModulo;
    }

    public String getDescricaoModulo() {
        return descricaoModulo;
    }

    public void setDescricaoModulo(String descricaoModulo) {
        this.descricaoModulo = descricaoModulo;
    }

    public int getOrdemModulo() {
        return ordemModulo;
    }

    public void setOrdemModulo(int ordemModulo) {
        this.ordemModulo = ordemModulo;
    }

    public String getCursoRelacionado() {
        return cursoRelacionado;
    }

    public void setCursoRelacionado(String cursoRelacionado) {
        this.cursoRelacionado = cursoRelacionado;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getStatusModulo() {
        return statusModulo;
    }

    public void setStatusModulo(String statusModulo) {
        this.statusModulo = statusModulo;
    }
}
