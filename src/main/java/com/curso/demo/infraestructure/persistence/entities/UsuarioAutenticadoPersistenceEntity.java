package com.curso.demo.infraestructure.persistence.entities;

import java.util.Collection;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import java.util.Collections;

public class UsuarioAutenticadoPersistenceEntity implements UserDetails {
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }
}
