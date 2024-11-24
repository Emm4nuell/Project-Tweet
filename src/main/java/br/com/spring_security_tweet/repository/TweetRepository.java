package br.com.spring_security_tweet.repository;

import br.com.spring_security_tweet.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
