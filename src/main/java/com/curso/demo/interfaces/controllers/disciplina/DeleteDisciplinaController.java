package com.curso.demo.interfaces.controllers.disciplina;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.disciplina.DeleteDisciplina;

@RestController
@RequestMapping("{/deletarDisciplina}")
public class DeleteDisciplinaController {
    private DeleteDisciplina deleteDisciplina;

    public DeleteDisciplinaController(DeleteDisciplina deleteDisciplina) {
        this.deleteDisciplina = deleteDisciplina;
    }

    @DeleteMapping("idDisciplina")
    public ResponseEntity<Void> deletar(@PathVariable UUID idDisciplina) {
        deleteDisciplina.executar(idDisciplina);
        return ResponseEntity.noContent().build();
    }
}
