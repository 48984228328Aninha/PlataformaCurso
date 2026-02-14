package com.curso.demo.infraestructure.persistence.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.infraestructure.persistence.entities.ResultadoPersistenceEntity;

public interface JpaResultadoRepository extends JpaRepository<ResultadoPersistenceEntity, UUID> {

}
