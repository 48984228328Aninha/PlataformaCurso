package com.curso.demo.infraestructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.demo.infraestructure.persistence.entities.RolePersistenceEntity;

public interface JpaRoleRepository extends JpaRepository<RolePersistenceEntity, Long> {

}
