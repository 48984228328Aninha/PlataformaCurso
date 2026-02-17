package com.curso.demo.application.services.cursos;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso.demo.domain.entities.Curso;
import com.curso.demo.domain.repositories.CursoDomainRepository;

@Service
public class UpdateCurso {
    private CursoDomainRepository cursoDomainRepository;

    public UpdateCurso(CursoDomainRepository cursoDomainRepository) {
        this.cursoDomainRepository = cursoDomainRepository;
    }

    public Curso executar(UUID id, Curso novosDados) {
        Curso existente = cursoDomainRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possível achar o curso"));

        novosDados.setAvaliacaoMedia(novosDados.getAvaliacaoMedia());
        novosDados.setCargaHoraria(novosDados.getCargaHoraria());
        novosDados.setCategoria(novosDados.getCategoria());
        novosDados.setCertificadoDisponivel(novosDados.getCertificadoDisponivel());
        novosDados.setDataAtualizacao(novosDados.getDataAtualizacao());
        novosDados.setDataCriacao(novosDados.getDataCriacao());
        novosDados.setDataPublicacao(novosDados.getDataPublicacao());
        novosDados.setDescricao(novosDados.getDescricao());
        novosDados.setId(novosDados.getId());
        novosDados.setIdioma(novosDados.getIdioma());
        novosDados.setInstrutorResponsavel(novosDados.getInstrutorResponsavel());
        novosDados.setNivel(novosDados.getNivel());
        novosDados.setNome(novosDados.getNome());
        novosDados.setObjetivo(novosDados.getObjetivo());
        novosDados.setPublicoAlvo(novosDados.getPublicoAlvo());
        novosDados.setQuantidadeAlunos(novosDados.getQuantidadeAlunos());
        novosDados.setRequisitosPrevios(novosDados.getRequisitosPrevios());
        novosDados.setStatus(novosDados.getStatus());
        novosDados.setTitulo(novosDados.getTitulo());

        return cursoDomainRepository.save(existente);
    }
}
