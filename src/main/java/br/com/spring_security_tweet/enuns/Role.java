package br.com.spring_security_tweet.enuns;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Role {
    ADMIN(1, "ADMIN"),
    GERENTE(2, "GERENTE"),
    VENDEDOR(3, "VENDEDOR"),
    ESTOQUISTA(4, "ESTOQUISTA"),
    BASIC(5, "BASIC");

    private final int id;
    private final String role;

    Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public static String isRole(String value){
        // Usando streams para verificar se a entrada corresponde a uma das roles
        return Arrays.stream(Role.values())  // Cria um stream a partir dos valores do enum Role
                .filter(r -> r.getRole().equalsIgnoreCase(value))  // Filtra as roles que coincidem com a entrada
                .map(Role::getRole)  // Mapeia o stream para retornar apenas o valor da role (String)
                .findFirst()  // Retorna o primeiro valor encontrado no stream
                .orElseThrow(() -> new NullPointerException("Erro ao localizar role"));  // Se não encontrar, retorna "BASIC" como padrão
    }
}
