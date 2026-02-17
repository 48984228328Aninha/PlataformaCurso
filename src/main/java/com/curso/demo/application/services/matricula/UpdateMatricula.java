package com.curso.demo.application.services.matricula;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.domain.repositories.MatriculaDomainRepository;

@Service
public class UpdateMatricula {
    private MatriculaDomainRepository matriculaDomainRepository;

    public UpdateMatricula(MatriculaDomainRepository matriculaDomainRepository) {
        this.matriculaDomainRepository = matriculaDomainRepository;
    }

    public Matricula executar(UUID id, Matricula novosDados) {
        Matricula existente = matriculaDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não possui matrícula"));

        novosDados.setCurso(novosDados.getCurso());
        novosDados.setDataConclusao(novosDados.getDataConclusao());
        novosDados.setDataInicio(novosDados.getDataInicio());
        novosDados.setDataMatricula(novosDados.getDataMatricula());
        novosDados.setProgressoGeral(novosDados.getProgressoGeral());
        novosDados.setStatusMatricula(novosDados.getStatusMatricula());
        novosDados.setUltimaAulaAcessada(novosDados.getUltimaAulaAcessada());
        novosDados.setUsuario(novosDados.getUsuario());

        return matriculaDomainRepository.save(existente);

    }
}
