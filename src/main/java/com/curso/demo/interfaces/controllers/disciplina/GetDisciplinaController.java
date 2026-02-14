package com.curso.demo.interfaces.controllers.disciplina;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.DisciplinaMapper;
import com.curso.demo.application.services.disciplina.GetDisciplinaById;
import com.curso.demo.domain.entities.Disciplina;
import com.curso.demo.interfaces.dto.DisciplinaInterfaceDto;

@RestController
@RequestMapping("/disciplinas")
public class GetDisciplinaController {
    private final GetDisciplinaById getDisciplinaById;

    public GetDisciplinaController(GetDisciplinaById getDisciplinaById) {
        this.getDisciplinaById = getDisciplinaById;
    }

    @GetMapping("/{idDisciplina}")
    public ResponseEntity<DisciplinaInterfaceDto> getDisciplina(@PathVariable UUID idDisciplina) {
        Disciplina disciplina = getDisciplinaById.executar(idDisciplina);
        DisciplinaInterfaceDto disciplinaDto = DisciplinaMapper.toDisciplinaDto(disciplina);
        return ResponseEntity.ok(disciplinaDto);
    }
}
