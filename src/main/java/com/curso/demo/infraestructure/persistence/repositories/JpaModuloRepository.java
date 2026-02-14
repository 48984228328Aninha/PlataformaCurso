package com.curso.demo.infraestructure.persistence.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.demo.infraestructure.persistence.entities.ModuloPersistenceEntity;

@Repository
public interface JpaModuloRepository extends JpaRepository<ModuloPersistenceEntity, UUID> {

}
