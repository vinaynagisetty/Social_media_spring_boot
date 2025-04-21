package com.social.media.service;

import com.social.media.models.SocialUser;
import com.social.media.repository.SocialUserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Social_Media_Service {

    @Autowired
    private  SocialUserRepository socialUserRepository;

    public SocialUser saveUser(SocialUser user) {
      return  socialUserRepository.save(user);
    }

    public List<SocialUser> getUsers() {
        return socialUserRepository.findAll();
    }
}
