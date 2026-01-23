package com.curso.demo.infraestructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.infraestructure.persistence.entities.AvaliacaoPersistenceEntity;

public interface JpaAvaliacaoRepository extends JpaRepository<AvaliacaoPersistenceEntity, Long> {

}
