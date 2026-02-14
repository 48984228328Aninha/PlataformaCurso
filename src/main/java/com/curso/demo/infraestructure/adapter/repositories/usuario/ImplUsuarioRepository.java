package com.curso.demo.infraestructure.adapter.repositories.usuario;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.UsuarioMapper;
import com.curso.demo.domain.entities.Usuario;
import com.curso.demo.domain.repositories.UsuarioDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.UsuarioPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaUsuarioRepository;

@Repository
public class ImplUsuarioRepository implements UsuarioDomainRepository {
    private JpaUsuarioRepository jpaUsuarioRepository;

    public ImplUsuarioRepository(JpaUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @Override
    public Optional<Usuario> findById(UUID id) {
        return jpaUsuarioRepository.findById(id)
                .map(UsuarioMapper::toDomain);
    }

    @Override
    public Usuario save(Usuario usuario) {
        UsuarioPersistenceEntity usuarioPersistenceEntity = UsuarioMapper.toEntity(usuario);

        UsuarioPersistenceEntity saved = jpaUsuarioRepository.save(usuarioPersistenceEntity);

        return UsuarioMapper.toDomain(saved);
    }

}
