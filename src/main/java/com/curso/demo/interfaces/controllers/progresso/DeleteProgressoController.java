package com.curso.demo.interfaces.controllers.progresso;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.progresso.DeleteProgresso;

@RestController
@RequestMapping("{/deletarProgresso}")
public class DeleteProgressoController {
    private DeleteProgresso deleteProgresso;

    public DeleteProgressoController(DeleteProgresso deleteProgresso) {
        this.deleteProgresso = deleteProgresso;
    }

    @DeleteMapping("idProgresso")
    public ResponseEntity<Void> deletar(@PathVariable UUID idProgresso) {
        deleteProgresso.executar(idProgresso);
        return ResponseEntity.noContent().build();
    }
}
