package com.social.media.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class SocialProfile {
    @Id
    public long id;
    @OneToOne(mappedBy = "socialProfile")
//  @JoinColumn(name="social user")
    public SocialUser user;
}
