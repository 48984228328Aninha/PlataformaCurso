package com.curso.demo.application.services.cursos;

import com.curso.demo.domain.entities.Curso;
import com.curso.demo.domain.repositories.CursoDomainRepository;

public class GetCursoById {

    private final CursoDomainRepository cursoDomainRepository;

    public GetCursoById(CursoDomainRepository cursoDomainRepository) {
        this.cursoDomainRepository = cursoDomainRepository;
    }

    public CursoDomainRepository getCursoDomainRepository() {
        return cursoDomainRepository;
    }

    public Curso executar(Long cursoId) {
        return cursoDomainRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }

}
