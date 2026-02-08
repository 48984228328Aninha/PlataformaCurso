package com.curso.demo.infraestructure.persistence.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.demo.infraestructure.persistence.entities.UsuarioPersistenceEntity;
import com.curso.demo.interfaces.dto.UsuarioInterfaceDto;

public interface JpaUsuarioRepository extends JpaRepository<UsuarioPersistenceEntity, UUID> {

    Optional<UsuarioPersistenceEntity> findByUsername(String username);

    List<UsuarioInterfaceDto> findAllUsuariosDto();
}
