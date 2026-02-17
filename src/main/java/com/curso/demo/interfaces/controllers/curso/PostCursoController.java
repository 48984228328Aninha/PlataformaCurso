package com.curso.demo.interfaces.controllers.curso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.CursoResultadoMapper;
import com.curso.demo.application.services.cursos.CreateCurso;
import com.curso.demo.domain.entities.Curso;
import com.curso.demo.interfaces.dto.CursoInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarCurso}")
public class PostCursoController {
    private final CreateCurso createCurso;

    public PostCursoController(CreateCurso createCurso) {
        this.createCurso = createCurso;
    }

    @PostMapping("curso")
    public ResponseEntity<CursoInterfaceDto> criarCurso(@RequestBody CursoInterfaceDto dto) {
        Curso curso = CursoResultadoMapper.toCursoDto(dto);
        Curso salvo = createCurso.executar(curso);
        return ResponseEntity.ok(CursoResultadoMapper.toCursoDto(salvo));
    }
}
