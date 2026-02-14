package com.curso.demo.interfaces.controllers.modulo;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ModuloMapper;
import com.curso.demo.application.services.modulo.GetModuloById;
import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.interfaces.dto.ModuloInterfaceDto;

@RestController
@RequestMapping("/modulos")
public class GetModuloController {
    private final GetModuloById getModuloById;

    public GetModuloController(GetModuloById getModuloById) {
        this.getModuloById = getModuloById;
    }

    @GetMapping("/{idModulo}")
    public ResponseEntity<ModuloInterfaceDto> getModuloById(@PathVariable UUID idModulo) {
        Modulo modulo = getModuloById.executar(idModulo);
        ModuloInterfaceDto moduloDto = ModuloMapper.toModuloDto(modulo);
        return ResponseEntity.ok(moduloDto);
    }
}
