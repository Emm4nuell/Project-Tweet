package br.com.spring_security_tweet.entity;

import br.com.spring_security_tweet.enuns.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(unique = true)
    private String username;
    private String password;
    /* Vai ter uma tabela no banco com o nome perfis */
    @ElementCollection(fetch = FetchType.LAZY) // Tera que vier essa lista de perfis do banco de dados obrigatoriamente
    @CollectionTable(name = "roles")
    @Enumerated(EnumType.STRING)
    private Set<RoleEnum> roles = new HashSet<>();
}
