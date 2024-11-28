package br.com.spring_security_tweet.repository;

import br.com.spring_security_tweet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
}
