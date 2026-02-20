package com.curso.demo.interfaces.controllers.resultado;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.resultado.DeleteResultado;

@RestController
@RequestMapping("{/deletarResultado}")
public class DeleteResultadoController {
    private DeleteResultado deleteResultado;

    public DeleteResultadoController(DeleteResultado deleteResultado) {
        this.deleteResultado = deleteResultado;
    }

    @DeleteMapping("idResultado")
    public ResponseEntity<Void> deletar(@PathVariable UUID idResultado) {
        deleteResultado.executar(idResultado);
        return ResponseEntity.noContent().build();
    }
}
