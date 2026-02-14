package com.curso.demo.interfaces.controllers.resultado;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.ResultadoMapper;
import com.curso.demo.application.services.resultado.GetResultadoById;
import com.curso.demo.domain.entities.Resultado;
import com.curso.demo.interfaces.dto.ResultadoInterfaceDto;

@RestController
@RequestMapping("/resultados")
public class GetResultadoController {
    private final GetResultadoById getResultadoById;

    public GetResultadoController(GetResultadoById getResultadoById) {
        this.getResultadoById = getResultadoById;
    }

    @GetMapping("/{idResultado}")
    public ResponseEntity<ResultadoInterfaceDto> getResultadoById(@PathVariable UUID idResultado) {
        Resultado resultado = getResultadoById.executar(idResultado);
        ResultadoInterfaceDto resultadoDto = ResultadoMapper.toResultadoDto(resultado);
        return ResponseEntity.ok(resultadoDto);

    }
}
