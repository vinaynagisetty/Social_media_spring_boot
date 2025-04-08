package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class SocialUser {
    @Id
    public Long id;

    @OneToOne
   @JoinColumn(name = "social_profile_id")
    public SocialProfile socialProfile;

    @OneToMany(mappedBy = "user")
//    @JoinColumn(name="social_post_id")
    public List<Post> SocialPost=new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name="User_id"),
            inverseJoinColumns = @JoinColumn(name="group_id")
    )
    public Set<SocilaGroup> socilaGroups=new HashSet<>();
}
