package com.curso.demo.interfaces.controllers.modulo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ModuloMapper;
import com.curso.demo.application.services.modulo.UpdateModulo;
import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.interfaces.dto.ModuloInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarModulo}")
public class PutModuloController {
    private UpdateModulo updateModulo;

    public PutModuloController(UpdateModulo updateModulo) {
        this.updateModulo = updateModulo;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<ModuloInterfaceDto> atualizar(@PathVariable UUID idModulo,
            @RequestBody ModuloInterfaceDto dto) {
        Modulo modulo = ModuloMapper.toDomain(dto);
        Modulo atualizado = updateModulo.executar(idModulo, modulo);
        return ResponseEntity.ok(ModuloMapper.toModuloDto(atualizado));
    }
}
