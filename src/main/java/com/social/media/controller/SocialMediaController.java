package com.social.media.controller;

import com.social.media.models.SocialUser;
import com.social.media.service.Social_Media_Service;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class SocialMediaController {

    @Autowired
    public Social_Media_Service social_media_service;

    @PostMapping
    public  ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser user) {
       SocialUser returnUser =social_media_service.saveUser(user);
        return new ResponseEntity<>(returnUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SocialUser>> getUsers() {
        List<SocialUser> users = social_media_service.getUsers();
        return new  ResponseEntity<>(users, HttpStatus.OK);
    }

}
