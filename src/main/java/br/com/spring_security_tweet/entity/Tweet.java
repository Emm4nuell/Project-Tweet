package br.com.spring_security_tweet.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "to_tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    private String content;
    @CreationTimestamp
    private Instant creationTimesTamp;
}
