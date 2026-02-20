package com.curso.demo.application.services.cursos;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.CursoDomainRepository;

@Service
public class DeleteCurso {
    private CursoDomainRepository cursoDomainRepository;

    public DeleteCurso(CursoDomainRepository cursoDomainRepository) {
        this.cursoDomainRepository = cursoDomainRepository;
    }

    public void executar(UUID id) {

        if (!cursoDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Não foi possível encontrar o curso");
        }

        cursoDomainRepository.deleteById(id);
    }
}
