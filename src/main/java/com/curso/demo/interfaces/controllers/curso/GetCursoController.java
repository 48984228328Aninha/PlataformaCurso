package com.curso.demo.interfaces.controllers.curso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.demo.application.mapper.CursoResultadoMapper;
import com.curso.demo.application.services.cursos.GetCursoById;
import com.curso.demo.domain.entities.Curso;
import com.curso.demo.interfaces.dto.CursoInterfaceDto;

@RestController
@RequestMapping("/cursos")
public class GetCursoController {
    private final GetCursoById getCursoById;

    public GetCursoController(GetCursoById getCursoById) {
        this.getCursoById = getCursoById;
    }

    @GetMapping("/{idCurso}")
    public ResponseEntity<CursoInterfaceDto> getCursoById(@PathVariable Long idCurso) {
        Curso curso = getCursoById.executar(idCurso);
        CursoInterfaceDto cursoDto = CursoResultadoMapper.toCursoDto(curso);
        return ResponseEntity.ok(cursoDto);
    }

}
