package com.curso.demo.application.services.modulo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.repositories.ModuloDomainRepository;

@Service
public class DeleteModulo {
    private ModuloDomainRepository moduloDomainRepository;

    public DeleteModulo(ModuloDomainRepository moduloDomainRepository) {
        this.moduloDomainRepository = moduloDomainRepository;
    }

    public void executar(UUID id) {

        if (!moduloDomainRepository.findById(id).isPresent()) {
            throw new RuntimeException("Não foi possível achar o módulo");
        }

        moduloDomainRepository.deleteById(id);
    }
}
