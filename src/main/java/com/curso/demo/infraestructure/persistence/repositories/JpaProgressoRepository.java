package com.curso.demo.infraestructure.persistence.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.infraestructure.persistence.entities.ProgressoPersistenceEntity;

public interface JpaProgressoRepository extends JpaRepository<ProgressoPersistenceEntity, UUID> {

}
