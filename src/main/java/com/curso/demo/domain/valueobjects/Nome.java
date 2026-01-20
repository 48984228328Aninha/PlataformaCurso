package com.curso.demo.domain.valueobjects;

import org.intellij.lang.annotations.Identifier;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Nome {
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @NotNull
    @NotBlank
    @Identifier
    private String nome;

    public Nome(String nome) {
        this.nome = nome;
        var violations = validator.validate(this);

        if (!violations.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo" + violations);
        }
    }

    public String getNome() {
        return nome;
    }
}
