package com.curso.demo.infraestructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.demo.infraestructure.persistence.entities.UsuarioPersistenceEntity;

public interface JpaUsuarioRepository extends JpaRepository<UsuarioPersistenceEntity, Long> {

}
