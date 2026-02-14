package com.curso.demo.interfaces.controllers.progresso;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ProgressoMapper;
import com.curso.demo.application.services.progresso.GetProgressoById;
import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.interfaces.dto.ProgressoInterfaceDto;

@RestController
@RequestMapping("progresso")
public class GetProgressoController {
    private final GetProgressoById getProgressoById;

    public GetProgressoController(GetProgressoById getProgressoById) {
        this.getProgressoById = getProgressoById;
    }

    @GetMapping("/{idProgresso}")
    public ResponseEntity<ProgressoInterfaceDto> getProgressoById(@PathVariable UUID idProgresso) {
        Progresso progresso = getProgressoById.executar(idProgresso);
        ProgressoInterfaceDto progressoDto = ProgressoMapper.toProgressoDto(progresso);
        return ResponseEntity.ok(progressoDto);
    }

}
