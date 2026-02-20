package com.curso.demo.interfaces.controllers.matricula;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.MatriculaMapper;
import com.curso.demo.application.services.matricula.UpdateMatricula;
import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.interfaces.dto.MatriculaInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarMatricula}")
public class PutMatriculaController {
    private UpdateMatricula updateMatricula;

    public PutMatriculaController(UpdateMatricula updateMatricula) {
        this.updateMatricula = updateMatricula;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<MatriculaInterfaceDto> atualizar(@PathVariable UUID idMatricula,
            @RequestBody MatriculaInterfaceDto dto) {
        Matricula matricula = MatriculaMapper.toDomain(dto);
        Matricula atualizado = updateMatricula.executar(idMatricula, matricula);
        return ResponseEntity.ok(MatriculaMapper.toMatriculaDto(atualizado));
    }
}
