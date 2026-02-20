package com.curso.demo.interfaces.controllers.progresso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ProgressoMapper;
import com.curso.demo.application.services.progresso.UpdateProgresso;
import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.interfaces.dto.ProgressoInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarProgresso}")
public class PutProgressoController {
    private UpdateProgresso updateProgresso;

    public PutProgressoController(UpdateProgresso updateProgresso) {
        this.updateProgresso = updateProgresso;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<ProgressoInterfaceDto> atualizar(@PathVariable UUID idProgresso,
            @RequestBody ProgressoInterfaceDto dto) {
        Progresso progresso = ProgressoMapper.toDomain(dto);
        Progresso atualizado = updateProgresso.executar(idProgresso, progresso);
        return ResponseEntity.ok(ProgressoMapper.toProgressoDto(atualizado));
    }
}
