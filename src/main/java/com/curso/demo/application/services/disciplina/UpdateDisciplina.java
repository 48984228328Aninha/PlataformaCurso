package com.curso.demo.application.services.disciplina;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.domain.repositories.DisciplinaDomainRepository;

@Service
public class UpdateDisciplina {
    private DisciplinaDomainRepository disciplinaDomainRepository;

    public UpdateDisciplina(DisciplinaDomainRepository disciplinaDomainRepository) {
        this.disciplinaDomainRepository = disciplinaDomainRepository;
    }

    public Disciplina executar(UUID id, Disciplina novosDados) {
        Disciplina existente = disciplinaDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possível achar Disciplina"));

        novosDados.setCargaHoraria(novosDados.getCargaHoraria());
        novosDados.setDescricao(novosDados.getDescricao());
        novosDados.setNomeDisciplina(novosDados.getNomeDisciplina());

        return disciplinaDomainRepository.save(existente);
    }
}
