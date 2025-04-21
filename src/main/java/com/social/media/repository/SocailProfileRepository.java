package com.social.media.repository;

import com.social.media.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface SocailProfileRepository extends JpaRepository<SocialProfile,Long> {
}
