package com.social.media.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class SocilaGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @ManyToMany(mappedBy = "socilaGroups")
    public Set<SocialUser> socialUsers=new HashSet<>();
}
