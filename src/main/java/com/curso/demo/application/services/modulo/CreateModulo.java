package com.curso.demo.application.services.modulo;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.domain.repositories.ModuloDomainRepository;

@Service
public class CreateModulo {
    private ModuloDomainRepository moduloDomainRepository;

    public CreateModulo(ModuloDomainRepository moduloDomainRepository) {
        this.moduloDomainRepository = moduloDomainRepository;
    }

    public Modulo executar(Modulo modulo) {
        return moduloDomainRepository.save(modulo);
    }

}
