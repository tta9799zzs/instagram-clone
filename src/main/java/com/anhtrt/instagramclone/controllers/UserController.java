package com.anhtrt.instagramclone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{userId}")
    public void getUser(){

    }
    @PostMapping("/follow/{userId}")
    public void follow(){}
    @PostMapping("/unfollow/{userId}")
    public void unFollow(){}
}
