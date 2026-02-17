package com.curso.demo.interfaces.controllers.resultado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ResultadoMapper;
import com.curso.demo.application.services.resultado.CreateResultado;
import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.interfaces.dto.ResultadoInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarResultado}")
public class PostResultadoController {
    private final CreateResultado createResultado;

    public PostResultadoController(CreateResultado createResultado) {
        this.createResultado = createResultado;
    }

    @PostMapping("resultado")
    public ResponseEntity<ResultadoInterfaceDto> criarResultado(@RequestBody ResultadoInterfaceDto dto) {
        Resultado resultado = ResultadoMapper.toResultadoDto(dto);
        Resultado salvo = createResultado.executar(resultado);
        return ResponseEntity.ok(ResultadoMapper.toResultadoDto(salvo));
    }

}
