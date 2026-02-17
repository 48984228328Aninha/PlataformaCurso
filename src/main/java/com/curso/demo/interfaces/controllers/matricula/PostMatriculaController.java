package com.curso.demo.interfaces.controllers.matricula;

import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.MatriculaMapper;
import com.curso.demo.application.services.matricula.CreateMatricula;
import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.interfaces.dto.MatriculaInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PostMatriculaController {
    private final CreateMatricula createMatricula;

    public PostMatriculaController(CreateMatricula createMatricula) {
        this.createMatricula = createMatricula;
    }

    @PostMapping("matricula")
    public ResponseEntity<MatriculaInterfaceDto> criarMatricula(@RequestBody MatriculaInterfaceDto dto) {
        Matricula matricula = MatriculaMapper.toMatriculaDto(dto);
        Matricula salvo = createMatricula.executar(matricula);
        return ResponseEntity.ok(MatriculaMapper.toMatriculaDto(salvo));
    }

}
