package br.com.spring_security_tweet.service;

import br.com.spring_security_tweet.entity.User;
import br.com.spring_security_tweet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User created(User user){
        return userRepository.save(user);
    }
}
