package com.curso.demo.application.services;

public class GetCursoById {

    private final CursoDomainRepository cursoDomainRepository;

    public GetCursoById(CursoDomainRepository cursoDomainRepository) {
        this.cursoDomainRepository = cursoDomainRepository;
    }
}
