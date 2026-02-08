package com.curso.demo.interfaces.controllers.avaliacao;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.avaliacao.GetAvaliacaoById;
import com.curso.demo.interfaces.dto.AvaliacaoInterfaceDto;

@RestController
@RequestMapping("/avaliacoes")
public class GetAvaliacaoController {
    @Autowired
    private final GetAvaliacaoById getAvaliacaoById;

    public GetAvaliacaoController(GetAvaliacaoById getAvaliacaoById) {
        this.getAvaliacaoById = getAvaliacaoById;
    }

    public ResponseEntity<AvaliacaoInterfaceDto> getAvaliacao(@PathVariable UUID id) {
        return getAvaliacaoById.executar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
