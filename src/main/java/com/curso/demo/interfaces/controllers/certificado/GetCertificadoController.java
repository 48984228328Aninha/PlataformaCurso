package com.curso.demo.interfaces.controllers.certificado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.application.mapper.CertificadoMapper;
import com.curso.demo.infraestructure.persistence.repositories.JpaCertificadoRepository;
import com.curso.demo.interfaces.dto.CertificadoInterfaceDto;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/certificados")
public class GetCertificadoController {
    private final JpaCertificadoRepository jpaCertificado;

    public GetCertificadoController(JpaCertificadoRepository jpaCertificado) {
        this.jpaCertificado = jpaCertificado;
    }

    @GetMapping("certificado")
    public ResponseEntity<CertificadoInterfaceDto> getCertificadoById() {
        List<CertificadoInterfaceDto> certificadosDto = jpaCertificado.findAll().stream()
                .map(CertificadoMapper::toCertificadoDto)
                .toList();
        return ResponseEntity.ok(certificadosDto.get(0));
    }

}
