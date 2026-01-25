package com.curso.demo.infraestructure.persistence.entities;

import java.util.Collection;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.GrantedAuthority;
import java.util.List;

public class UsuarioAutenticadoPersistenceEntity implements UserDetails {
    private final UsuarioPersistenceEntity usuario;

    public UsuarioAutenticadoPersistenceEntity(UsuarioPersistenceEntity usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> "read");
    }

    @Override
    public String getPassword() {
        return usuario.getSenhaUsuario();
    }

    @Override
    public String getUsername() {
        return usuario.getUsuarioNome();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
