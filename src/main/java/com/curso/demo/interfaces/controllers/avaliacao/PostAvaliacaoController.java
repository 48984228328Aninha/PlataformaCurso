package com.curso.demo.interfaces.controllers.avaliacao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.application.services.user.CreateUser;
import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.interfaces.dto.ResultadoInterfaceDto;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/criarUsuario")
public class PostUserController {
    private final CreateUser createUser;

    public PostUserController(CreateUser createUser) {
        this.createUser = createUser;
    }

    @PostMapping("usuario")
    public ResponseEntity<UsuarioInterfaceDto> criar(@RequestBody ResultadoInterfaceDto dto) {
        Usuario usuario = UsuarioMapper.toDomain(null, null, null, null, null);
        Usuario salvo = createUser.executar(usuario);
        return ResponseEntity.ok(UsuarioMapper.toUsuarioDto(salvo));
    }
}
