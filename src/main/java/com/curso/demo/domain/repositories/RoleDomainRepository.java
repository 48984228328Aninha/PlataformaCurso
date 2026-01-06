package com.curso.demo.domain.repositories;

import java.util.Optional;

import com.curso.demo.domain.entities.Role;

public interface RoleDomainRepository {
    Optional<Role> findById(Long id);

    void save(Role role);
}