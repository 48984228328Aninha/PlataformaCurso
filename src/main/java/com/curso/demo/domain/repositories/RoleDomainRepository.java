package com.curso.demo.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.curso.demo.domain.entities.Role;

public interface RoleDomainRepository {
    Optional<Role> findById(Long id);

    void save(Role role);

    void deleteById(UUID id);
}