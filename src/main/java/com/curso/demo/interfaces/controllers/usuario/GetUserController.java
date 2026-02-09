package com.curso.demo.interfaces.controllers.usuario;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.user.GetUserById;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/users")
public class GetUserController {
    private final GetUserById getUserById;

    public GetUserController(GetUserById getUserById) {
        this.getUserById = getUserById;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioInterfaceDto> getUser(@PathVariable UUID id) {
        UsuarioInterfaceDto usuario = getUserById.executar(id);
        return ResponseEntity.ok(usuario);
    }
}
