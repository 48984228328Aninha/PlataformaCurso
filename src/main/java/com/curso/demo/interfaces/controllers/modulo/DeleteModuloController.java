package com.curso.demo.interfaces.controllers.modulo;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.modulo.DeleteModulo;

@RestController
@RequestMapping("{/deletarModulo}")
public class DeleteModuloController {
    private DeleteModulo deleteModulo;

    public DeleteModuloController(DeleteModulo deleteModulo) {
        this.deleteModulo = deleteModulo;
    }

    @DeleteMapping("idModulo")
    public ResponseEntity<Void> deletar(@PathVariable UUID idModulo) {
        deleteModulo.executar(idModulo);
        return ResponseEntity.noContent().build();
    }
}
