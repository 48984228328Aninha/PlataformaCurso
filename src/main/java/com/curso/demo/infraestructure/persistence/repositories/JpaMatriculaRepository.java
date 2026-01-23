package com.curso.demo.infraestructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.infraestructure.persistence.entities.MatriculaPersistenceEntity;

public interface JpaMatriculaRepository extends JpaRepository<MatriculaPersistenceEntity, Long> {

}
