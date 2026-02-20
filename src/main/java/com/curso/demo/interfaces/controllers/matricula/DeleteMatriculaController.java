package com.curso.demo.interfaces.controllers.matricula;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.matricula.DeleteMatricula;

@RestController
@RequestMapping("{/deletarMatricula}")
public class DeleteMatriculaController {
    private DeleteMatricula deleteMatricula;

    public DeleteMatriculaController(DeleteMatricula deleteMatricula) {
        this.deleteMatricula = deleteMatricula;
    }

    @DeleteMapping("idMatricula")
    public ResponseEntity<Void> deletar(@PathVariable UUID idMatricula) {
        deleteMatricula.executar(idMatricula);
        return ResponseEntity.noContent().build();
    }
}
