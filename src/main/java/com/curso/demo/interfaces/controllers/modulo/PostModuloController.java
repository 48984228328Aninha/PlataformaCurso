package com.curso.demo.interfaces.controllers.modulo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ModuloMapper;
import com.curso.demo.application.services.modulo.CreateModulo;
import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.interfaces.dto.ModuloInterfaceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarModulo}")
public class PostModuloController {
    private final CreateModulo createModulo;

    public PostModuloController(CreateModulo createModulo) {
        this.createModulo = createModulo;
    }

    @PostMapping("modulo")
    public ResponseEntity<ModuloInterfaceDto> criarModulo(@RequestBody ModuloInterfaceDto dto) {
        Modulo modulo = ModuloMapper.toModuloDto(dto);
        Modulo salvo = createModulo.executar(modulo);
        return ResponseEntity.ok(ModuloMapper.toModuloDto(salvo));
    }

}
