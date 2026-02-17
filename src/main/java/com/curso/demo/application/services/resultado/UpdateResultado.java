package com.curso.demo.application.services.resultado;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.domain.repositories.ResultadoDomainRepository;

@Service
public class UpdateResultado {
    private ResultadoDomainRepository resultadoDomainRepository;

    public UpdateResultado(ResultadoDomainRepository resultadoDomainRepository) {
        this.resultadoDomainRepository = resultadoDomainRepository;
    }

    public Resultado executar(UUID id, Resultado novosDados) {
        Resultado existente = resultadoDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não possui resultado"));

        novosDados.setAvaliacao(novosDados.getAvaliacao());
        novosDados.setDataSubmissao(novosDados.getDataSubmissao());
        novosDados.setFeedback(novosDados.getFeedback());
        novosDados.setNotaObtida(novosDados.getNotaObtida());
        novosDados.setStatus(novosDados.getStatus());
        novosDados.setTentativa(novosDados.getTentativa());
        novosDados.setUsuario(novosDados.getUsuario());

        return resultadoDomainRepository.save(existente);
    }
}
