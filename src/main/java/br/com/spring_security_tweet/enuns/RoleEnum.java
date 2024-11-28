package br.com.spring_security_tweet.enuns;

import lombok.Getter;

@Getter
public enum RoleEnum {
    ADMIN(1, "ADMIN"),
    GERENTE(2, "GERENTE"),
    VENDEDOR(3, "VENDEDOR"),
    ESTOQUISTA(4, "ESTOQUISTA"),
    BASIC(5, "BASIC");

    private int id;
    private String role;

    RoleEnum(int id, String role) {
        this.id = id;
        this.role = role;
    }
}
