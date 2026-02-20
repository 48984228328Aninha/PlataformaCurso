package com.curso.demo.interfaces.controllers.disciplina;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.DisciplinaMapper;
import com.curso.demo.application.services.disciplina.UpdateDisciplina;
import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.interfaces.dto.DisciplinaInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarDisciplina}")
public class PutDisciplinaController {
    private UpdateDisciplina updateDisciplina;

    public PutDisciplinaController(UpdateDisciplina updateDisciplina) {
        this.updateDisciplina = updateDisciplina;
    }

    @PutMapping("idDisciplina")
    public ResponseEntity<DisciplinaInterfaceDto> atualizar(@PathVariable UUID id,
            @RequestBody DisciplinaInterfaceDto dto) {
        Disciplina disciplina = DisciplinaMapper.toDomain(dto);
        Disciplina atualizado = updateDisciplina.executar(id, disciplina);
        return ResponseEntity.ok(DisciplinaMapper.toDisciplinaDto(atualizado));
    }
}
