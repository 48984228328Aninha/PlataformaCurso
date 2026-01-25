package com.curso.demo.application.services.role;

import com.curso.demo.domain.entities.Role;
import com.curso.demo.domain.repositories.RoleDomainRepository;

public class GetRoleById {
    private RoleDomainRepository roleDomainRepository;

    public GetRoleById(RoleDomainRepository roleDomainRepository) {
        this.roleDomainRepository = roleDomainRepository;
    }

    public RoleDomainRepository getRoleDomainRepository() {
        return roleDomainRepository;
    }

    public Role executar(Long roleId) {
        return roleDomainRepository.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role não encontrada"));
    }
}
