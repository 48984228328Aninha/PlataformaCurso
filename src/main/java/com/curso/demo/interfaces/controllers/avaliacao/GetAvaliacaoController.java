package com.curso.demo.interfaces.controllers.avaliacao;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.AvaliacaoMapper;
import com.curso.demo.infraestructure.persistence.repositories.JpaAvaliacaoRepository;
import com.curso.demo.interfaces.dto.AvaliacaoInterfaceDto;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    private final JpaAvaliacaoRepository jpaAvaliacaoRepository;

    public AvaliacaoController(JpaAvaliacaoRepository jpaAvaliacaoRepository) {
        this.jpaAvaliacaoRepository = jpaAvaliacaoRepository;
    }

    public ResponseEntity<List<AvaliacaoInterfaceDto>> getAvaliacoes() {
        List<AvaliacaoInterfaceDto> avaliacaoDto = jpaAvaliacaoRepository.findAll().stream()
                .map(AvaliacaoMapper::toAvaliacaoDto)
                .toList();
        return ResponseEntity.ok(avaliacaoDto);
    }
}
