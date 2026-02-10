package com.curso.demo.interfaces.controllers.matricula;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.MatriculaMapper;
import com.curso.demo.application.services.matricula.GetMatriculaById;
import com.curso.demo.domain.entities.Matricula;
import com.curso.demo.interfaces.dto.MatriculaInterfaceDto;

@RestController
@RequestMapping("/matriculas")
public class GetMatriculaController {
    private final GetMatriculaById getMatriculaById;

    public GetMatriculaController(GetMatriculaById getMatriculaById) {
        this.getMatriculaById = getMatriculaById;
    }

    @GetMapping("/{idMatricula}")
    public ResponseEntity<MatriculaInterfaceDto> getMatricula(@PathVariable Long idMatricula) {
        Matricula matricula = getMatriculaById.executar(idMatricula);
        MatriculaInterfaceDto matriculaDto = MatriculaMapper.toMatriculaDto(matricula);
        return ResponseEntity.ok(matriculaDto);
    }
}
