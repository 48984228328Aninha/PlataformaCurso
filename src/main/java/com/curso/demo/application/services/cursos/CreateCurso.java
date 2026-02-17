package com.curso.demo.application.services.cursos;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Curso;
import com.curso.demo.domain.repositories.CursoDomainRepository;

@Service
public class CreateCurso {
    private CursoDomainRepository cursoDomainRepository;

    public CreateCurso(CursoDomainRepository cursoDomainRepository) {
        this.cursoDomainRepository = cursoDomainRepository;
    }

    public Curso executar(Curso curso) {
        return cursoDomainRepository.save(curso);
    }
}
