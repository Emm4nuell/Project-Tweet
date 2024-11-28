package br.com.spring_security_tweet.dto;

import br.com.spring_security_tweet.enuns.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest implements Serializable {
    private String username;
    private String password;
    private Set<RoleEnum> roles = new HashSet<>();
}
