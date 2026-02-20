package com.curso.demo.interfaces.controllers.curso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.CursoResultadoMapper;
import com.curso.demo.application.services.cursos.UpdateCurso;
import com.curso.demo.domain.entities.Curso;
import com.curso.demo.interfaces.dto.CursoInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarCurso}")
public class PutCursoController {
    private UpdateCurso updateCurso;

    public PutCursoController(UpdateCurso updateCurso) {
        this.updateCurso = updateCurso;
    }

    @PutMapping("idCurso")
    public ResponseEntity<CursoInterfaceDto> atualizar(@PathVariable UUID idCurso, @RequestBody CursoInterfaceDto dto) {
        Curso curso = CursoResultadoMapper.toDomain(dto);
        Curso atualizado = updateCurso.executar(idCurso, curso);
        return ResponseEntity.ok(CursoResultadoMapper.toCursoDto(atualizado));

    }

}
