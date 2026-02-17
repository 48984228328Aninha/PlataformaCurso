package com.curso.demo.application.services.modulo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.domain.repositories.ModuloDomainRepository;

@Service
public class UpdateModulo {
    private ModuloDomainRepository moduloDomainRepository;

    public UpdateModulo(ModuloDomainRepository moduloDomainRepository) {
        this.moduloDomainRepository = moduloDomainRepository;
    }

    public Modulo executar(UUID id, Modulo novosDados) {
        Modulo existente = moduloDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não possui módulos"));

        novosDados.setCargaHoraria(novosDados.getCargaHoraria());
        novosDados.setCursoRelacionado(novosDados.getCursoRelacionado());
        novosDados.setDescricaoModulo(novosDados.getDescricaoModulo());
        novosDados.setOrdemModulo(novosDados.getOrdemModulo());
        novosDados.setStatusModulo(novosDados.getStatusModulo());
        novosDados.setTitulo(novosDados.getTitulo());

        return moduloDomainRepository.save(existente);
    }
}
