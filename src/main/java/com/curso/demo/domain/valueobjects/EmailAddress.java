package com.curso.demo.domain.valueobjects;

import jakarta.validation.Validator;
import jakarta.validation.Validation;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmailAddress {
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @NotNull
    @NotBlank
    @Email
    private String endereco;

    public EmailAddress(String endereco) {
        this.endereco = endereco;
        var violations = validator.validate(this);

        if (!violations.isEmpty()) {
            throw new IllegalArgumentException("Endereço de email inválido: " + violations);
        }
    }

    public String getEndereco() {
        return endereco;
    }

};
