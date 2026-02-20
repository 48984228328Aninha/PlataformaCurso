package com.curso.demo.interfaces.controllers.certificado;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.services.certificado.DeleteCertificado;

@RestController
@RequestMapping("{/deletarCertificado}")
public class DeleteCertificadoController {
    private DeleteCertificado deleteCertificado;

    public DeleteCertificadoController(DeleteCertificado deleteCertificado) {
        this.deleteCertificado = deleteCertificado;
    }

    @DeleteMapping("idCertificado")
    public ResponseEntity<Void> deletar(@PathVariable UUID idCertificado) {
        deleteCertificado.executar(idCertificado);
        return ResponseEntity.noContent().build();
    }
}
