package com.curso.demo.infraestructure.persistence.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.infraestructure.persistence.entities.CursoPersistenceEntity;

public interface JpaCursoRepository extends JpaRepository<CursoPersistenceEntity, UUID> {

}
