package com.curso.demo.infraestructure.adapter.repositories.modulo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.curso.demo.application.mapper.ModuloMapper;
import com.curso.demo.domain.entities.Modulo;
import com.curso.demo.domain.repositories.ModuloDomainRepository;
import com.curso.demo.infraestructure.persistence.entities.ModuloPersistenceEntity;
import com.curso.demo.infraestructure.persistence.repositories.JpaModuloRepository;

@Repository
public class ImplModuloRepository implements ModuloDomainRepository {
    private JpaModuloRepository jpaModuloRepository;

    public ImplModuloRepository(JpaModuloRepository jpaModuloRepository) {
        this.jpaModuloRepository = jpaModuloRepository;
    }

    @Override
    public Optional<Modulo> findById(UUID id) {
        return jpaModuloRepository.findById(id)
                .map(ModuloMapper::toDomain);
    }

    @Override
    public Modulo save(Modulo modulo) {
        ModuloPersistenceEntity moduloPersistence = ModuloMapper.toEntity(modulo);

        ModuloPersistenceEntity saved = jpaModuloRepository.save(moduloPersistence);

        return ModuloMapper.toDomain(saved);
    }

    @Override
    public void deleteById(UUID id) {
        jpaModuloRepository.deleteById(id);
    }

}
