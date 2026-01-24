package com.curso.demo.domain.entities;

public class Modulo {
    private Long idModulo;
    private String tituloModulo;
    private String descricaoModulo;
    private int ordemModulo;
    private String cursoRelacionado;
    private int cargaHorariaModulo;
    private String statusModulo;

    public Modulo() {
    }

    public Modulo(Long idModulo, String tituloModulo, String descricaoModulo, int ordemModulo,
            String cursoRelacionado, int cargaHorariaModulo, String statusModulo) {
        this.idModulo = idModulo;
        this.tituloModulo = tituloModulo;
        this.descricaoModulo = descricaoModulo;
        this.ordemModulo = ordemModulo;
        this.cursoRelacionado = cursoRelacionado;
        this.cargaHorariaModulo = cargaHorariaModulo;
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
        return cargaHorariaModulo;
    }

    public void setCargaHoraria(int cargaHorariaModulo) {
        this.cargaHorariaModulo = cargaHorariaModulo;
    }

    public String getStatusModulo() {
        return statusModulo;
    }

    public void setStatusModulo(String statusModulo) {
        this.statusModulo = statusModulo;
    }
}
