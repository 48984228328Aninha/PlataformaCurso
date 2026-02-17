package com.curso.demo.interfaces.controllers.disciplina;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.DisciplinaMapper;
import com.curso.demo.application.services.disciplina.CreateDisciplina;
import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.interfaces.dto.DisciplinaInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarDisciplina}")
public class PostDisciplinaController {
    private final CreateDisciplina createDisciplina;

    public PostDisciplinaController(CreateDisciplina createDisciplina) {
        this.createDisciplina = createDisciplina;
    }

    @PostMapping("disciplina")
    public ResponseEntity<DisciplinaInterfaceDto> criarDisciplina(@RequestBody DisciplinaInterfaceDto dto) {
        Disciplina disciplina = DisciplinaMapper.toDisciplinaDto(dto);
        Disciplina salvo = createDisciplina.executar(disciplina);
        return ResponseEntity.ok(DisciplinaMapper.toDisciplinaDto(salvo));
    }

}
