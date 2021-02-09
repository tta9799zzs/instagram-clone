package com.anhtrt.instagramclone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {
    @RequestMapping("/home")
    public String login(){
        return "login";
    }
}
