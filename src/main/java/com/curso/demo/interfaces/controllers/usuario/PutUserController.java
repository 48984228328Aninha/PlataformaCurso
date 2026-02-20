package com.curso.demo.interfaces.controllers.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.application.services.user.UpdateUser;
import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarUsuario}")
public class PutUserController {
    private UpdateUser updateUser;

    public PutUserController(UpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<UsuarioInterfaceDto> atualizar(@PathVariable UUID idUsuario,
            @RequestBody UsuarioInterfaceDto dto) {
        Usuario usuario = UsuarioMapper.toDomain(dto);
        Usuario atualizado = updateUser.executar(idUsuario, usuario);
        return ResponseEntity.ok(UsuarioMapper.toUsuarioDto(atualizado));
    }
}
