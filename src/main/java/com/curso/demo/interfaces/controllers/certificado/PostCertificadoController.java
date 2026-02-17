package com.curso.demo.interfaces.controllers.certificado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.CertificadoMapper;
import com.curso.demo.application.services.certificado.CreateCertificado;
import com.curso.demo.domain.entities.Certificado;
import com.curso.demo.interfaces.dto.CertificadoInterfaceDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("{/criarCertificado}")
public class PostCertificadoController {
    private final CreateCertificado createCertificado;

    public PostCertificadoController(CreateCertificado createCertificado) {
        this.createCertificado = createCertificado;
    }

    @PostMapping("{/certificado}")
    public ResponseEntity<CertificadoInterfaceDto> criarCertificado(@RequestBody CertificadoInterfaceDto dto) {
        Certificado certificado = CertificadoMapper.toDomain(dto);
        Certificado salvo = createCertificado.executar(certificado);
        return ResponseEntity.ok(CertificadoMapper.toCertificadoDto(salvo));
    }
}
