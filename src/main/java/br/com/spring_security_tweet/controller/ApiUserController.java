package br.com.spring_security_tweet.controller;

import br.com.spring_security_tweet.dto.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public interface ApiUserController {
    @PostMapping
    ResponseEntity<Void> created(@RequestBody UserRequest request);
}
