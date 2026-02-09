package com.curso.demo.application.services.avaliacao;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.application.mapper.AvaliacaoMapper;
import com.curso.demo.domain.repositories.AvaliacaoDomainRepository;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;
import com.curso.demo.interfaces.dto.AvaliacaoInterfaceDto;

public class GetAvaliacaoById {
    private final AvaliacaoDomainRepository avaliacaoDomainRepository;

    public GetAvaliacaoById(AvaliacaoDomainRepository avaliacaoDomainRepository) {
        this.avaliacaoDomainRepository = avaliacaoDomainRepository;
    }

    public UsuarioDomainRepository usuarioDomainRepository() {
        return usuarioDomainRepository();
    }

    public Optional<AvaliacaoInterfaceDto> executar(UUID avaliacaoId) {
        return avaliacaoDomainRepository.findById(avaliacaoId)
                .map(AvaliacaoMapper::toAvaliacaoDto);
    }

}
