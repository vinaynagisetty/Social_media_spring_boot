package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  long id;

    @ManyToOne
  @JoinColumn(name="user_id")
    public SocialUser user;
}
