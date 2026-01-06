package com.curso.demo.domain.entities;

public class Role {
    private Long id;
    private String rolename;

    public Role() {
    }

    public Role(Long id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public Long getId() {
        return id;
    }

    public String getRolename() {
        return rolename;
    }
}
