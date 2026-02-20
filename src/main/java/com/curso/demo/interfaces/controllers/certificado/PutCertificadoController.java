package com.curso.demo.interfaces.controllers.certificado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.CertificadoMapper;
import com.curso.demo.application.services.certificado.UpdateCertificado;
import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.interfaces.dto.CertificadoInterfaceDto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("{/atualizarCertificado}")
public class PutCertificadoController {
    private UpdateCertificado updateCertificado;

    public PutCertificadoController(UpdateCertificado updateCertificado) {
        this.updateCertificado = updateCertificado;
    }

    @PutMapping("idCertificado")
    public ResponseEntity<CertificadoInterfaceDto> atualizar(@PathVariable UUID idResultado,
            @RequestBody CertificadoInterfaceDto dto) {
        Certificado certificado = CertificadoMapper.toDomain(dto);
        Certificado atualizado = updateCertificado.executar(idResultado, certificado);
        return ResponseEntity.ok(CertificadoMapper.toCertificadoDto(atualizado));
    }
}
