package com.curso.demo.interfaces.controllers.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.infraestructure.persistence.repositories.JpaUsuarioRepository;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class GetUserController {
    private final JpaUsuarioRepository jpaUsuarioRepository;

    public GetUserController(JpaUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @GetMapping

    public ResponseEntity<List<UsuarioInterfaceDto>> getUsers() {
        List<UsuarioInterfaceDto> usuariosDto = jpaUsuarioRepository.findAll().stream()
                .map(UsuarioMapper::toUsuarioDto)
                .toList();
        return ResponseEntity.ok(usuariosDto);
    }
}
