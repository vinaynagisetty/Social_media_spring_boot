package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocilaGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }


    @ManyToMany(mappedBy = "socilaGroups")
    @JsonIgnore
    public Set<SocialUser> socialUsers=new HashSet<>();
}
