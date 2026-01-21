package com.curso.demo.domain.valueobjects;

public class Nota {
    private int notaAluno;
    private int notaMaxima;

    public Nota(int notaAluno, int notaMaxima, int notaMinima) {
        this.notaAluno = notaAluno;

        if (notaAluno > notaMaxima || notaAluno < notaMinima) {
            throw new IllegalArgumentException("nota inválida/insuficiente");
        }
        this.notaAluno = notaAluno;
    }

    public int getNotaAluno() {
        return notaAluno;
    }

    public boolean foiAprovado() {
        return notaAluno >= notaMaxima;
    }
}