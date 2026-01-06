package com.curso.demo.infraestructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.demo.infraestructure.persistence.entities.DisciplinaPersistenceEntity;

public interface JpaDisciplinaRepository extends JpaRepository<DisciplinaPersistenceEntity, Long> {

}
