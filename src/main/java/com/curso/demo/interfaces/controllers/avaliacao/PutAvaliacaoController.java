package com.curso.demo.interfaces.controllers.avaliacao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.AvaliacaoMapper;
import com.curso.demo.application.services.avaliacao.UpdateAvaliacao;
import com.curso.demo.domain.entities.Avaliacao;
import com.curso.demo.interfaces.dto.AvaliacaoInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarAvaliacao}")
public class PutAvaliacaoController {
    private final UpdateAvaliacao updateAvaliacao;

    public PutAvaliacaoController(UpdateAvaliacao updateAvaliacao) {
        this.updateAvaliacao = updateAvaliacao;
    }

    @PutMapping("{idAvaliacao}")
    public ResponseEntity<AvaliacaoInterfaceDto> atualizar(@PathVariable UUID idResultado,
            @RequestBody AvaliacaoInterfaceDto dto) {
        Avaliacao avaliacao = AvaliacaoMapper.toDomain(dto);
        Avaliacao atualizada = updateAvaliacao.executar(idResultado, avaliacao);
        return ResponseEntity.ok(AvaliacaoMapper.toAvaliacaoDto(atualizada));

    }
}
