package com.curso.demo.domain.entities;

import java.security.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private UUID idUsuario;
    private String username;
    private String email;
    private String password;
    private UsuarioRole role;
    private String nomeDeExibicao;
    private String status;
    private Timestamp dataCriacao;
    private Timestamp dataUltimaAtualizacao;
    private String fotoDePerfil;
    private String preferenciasDeIdioma;
    private Timestamp ultimoAcesso;

    public Usuario() {
    }

    public Usuario(UUID idUsuario, String username, String email, String password, UsuarioRole role,
            String nomeDeExibicao,
            String status, Timestamp dataCriacao, Timestamp dataUltimaAtualizacao, String fotoDePerfil,
            String preferenciasDeIdioma, Timestamp ultimoAcesso) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.nomeDeExibicao = nomeDeExibicao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.fotoDePerfil = fotoDePerfil;
        this.preferenciasDeIdioma = preferenciasDeIdioma;
        this.ultimoAcesso = ultimoAcesso;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public enum UsuarioRole {
        ADMIN,
        STUDENT,
        INSTRUCTOR
    }

    public UsuarioRole getRole() {
        return role;
    }

    public void setRole(UsuarioRole role) {
        this.role = role;
    }

    public String getNomeDeExibicao() {
        return nomeDeExibicao;
    }

    public void setNomeDeExibicao(String nomeDeExibicao) {
        this.nomeDeExibicao = nomeDeExibicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public Timestamp getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }

    public String getPreferenciasDeIdioma() {
        return preferenciasDeIdioma;
    }

    public void setPreferenciasDeIdioma(String preferenciasDeIdioma) {
        this.preferenciasDeIdioma = preferenciasDeIdioma;
    }

    public Timestamp getUltimoAcesso() {
        return ultimoAcesso;
    }

}
