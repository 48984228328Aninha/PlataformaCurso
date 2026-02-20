package com.curso.demo.interfaces.controllers.usuario;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.user.DeleteUser;

@RestController
@RequestMapping("{/deletarUsuario}")
public class DeleteUserController {
    private DeleteUser deleteUser;

    public DeleteUserController(DeleteUser deleteUser) {
        this.deleteUser = deleteUser;
    }

    @DeleteMapping("idUsuario")
    public ResponseEntity<Void> deletar(@PathVariable UUID idUsuario) {
        deleteUser.executar(idUsuario);
        return ResponseEntity.noContent().build();
    }
}
