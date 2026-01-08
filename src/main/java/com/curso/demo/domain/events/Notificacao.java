package com.curso.demo.domain.events;

import java.security.Timestamp;

public class Notificacao {
    private Long idNotificacao;
    private String tipoNotificacao;
    private String mensagemNotificacao;
    private String statusNotificacao;
    private Timestamp dataEnvioNotificacao;

    public Notificacao() {
    }

    public Notificacao(Long idNotificacao, String tipoNotificacao, String mensagemNotificacao, String statusNotificacao,
            Timestamp dataEnvioNotificacao) {
        this.idNotificacao = idNotificacao;
        this.tipoNotificacao = tipoNotificacao;
        this.mensagemNotificacao = mensagemNotificacao;
        this.statusNotificacao = statusNotificacao;
        this.dataEnvioNotificacao = dataEnvioNotificacao;
    }

    public Long getIdNotificacao() {
        return idNotificacao;
    }

    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public String getMensagemNotificacao() {
        return mensagemNotificacao;
    }

    public String getStatusNotificacao() {
        return statusNotificacao;
    }

    public Timestamp getDataEnvioNotificacao() {
        return dataEnvioNotificacao;
    }
}