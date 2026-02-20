package com.curso.demo.interfaces.controllers.curso;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.cursos.DeleteCurso;

@RestController
@RequestMapping("{/deletarCurso}")
public class DeleteCursoController {
    private DeleteCurso deleteCurso;

    public DeleteCursoController(DeleteCurso deleteCurso) {
        this.deleteCurso = deleteCurso;
    }

    @DeleteMapping("idCurso")
    public ResponseEntity<Void> deletar(@PathVariable UUID idCurso) {
        deleteCurso.executar(idCurso);
        return ResponseEntity.noContent().build();
    }
}
