package com.curso.demo.interfaces.controllers.resultado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ResultadoMapper;
import com.curso.demo.application.services.resultado.UpdateResultado;
import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.interfaces.dto.ResultadoInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarResultado}")
public class PutResultadoController {
    private UpdateResultado updateResultado;

    public PutResultadoController(UpdateResultado updateResultado) {
        this.updateResultado = updateResultado;
    }

    @PutMapping("path/{id}")
    public ResponseEntity<ResultadoInterfaceDto> atualizar(@PathVariable UUID idResultado,
            @RequestBody ResultadoInterfaceDto dto) {
        Resultado resultado = ResultadoMapper.toDomain(dto);
        Resultado atualizado = updateResultado.executar(idResultado, resultado);
        return ResponseEntity.ok(ResultadoMapper.toResultadoDto(atualizado));
    }
}
