package br.com.spring_security_tweet.controller.user;

import br.com.spring_security_tweet.controller.ApiUserController;
import br.com.spring_security_tweet.dto.UserRequest;
import br.com.spring_security_tweet.entity.User;
import br.com.spring_security_tweet.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class UserController implements ApiUserController {

    private final UserService userService;
    private final ObjectMapper mapper;

    @Override
    public ResponseEntity<Void> created(UserRequest request) {

        var user = userService.created(mapper.convertValue(request, User.class));

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/id")
                .buildAndExpand(user.getUserId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
