package com.curso.demo.interfaces.controllers.progresso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ProgressoMapper;
import com.curso.demo.application.services.progresso.CreateProgresso;
import com.curso.demo.domain.entities.Progresso;
import com.curso.demo.interfaces.dto.ProgressoInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarProgresso}")
public class PostProgressoController {
    private final CreateProgresso createProgresso;

    public PostProgressoController(CreateProgresso createProgresso) {
        this.createProgresso = createProgresso;
    }

    @PostMapping("progresso")
    public ResponseEntity<ProgressoInterfaceDto> criarProgresso(@RequestBody ProgressoInterfaceDto dto) {
        Progresso progresso = ProgressoMapper.toProgressoDto(dto);
        Progresso salvo = createProgresso.executar(progresso);
        return ResponseEntity.ok(ProgressoMapper.toProgressoDto(salvo));
    }
}
