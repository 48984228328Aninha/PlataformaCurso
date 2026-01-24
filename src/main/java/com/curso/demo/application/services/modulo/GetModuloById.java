package com.curso.demo.application.services.modulo;

import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.domain.repositories.ModuloDomainRepository;

public class GetModuloById {
    private final ModuloDomainRepository moduloDomainRepository;

    public GetModuloById(ModuloDomainRepository moduloDomainRepository) {
        this.moduloDomainRepository = moduloDomainRepository;
    }

    public ModuloDomainRepository getModuloDomainRepository() {
        return moduloDomainRepository;
    }

    public Modulo executar(Long moduloId) {
        return moduloDomainRepository.findById(moduloId)
                .orElseThrow(() -> new RuntimeException("Curso não possui módulos"));
    }
}
