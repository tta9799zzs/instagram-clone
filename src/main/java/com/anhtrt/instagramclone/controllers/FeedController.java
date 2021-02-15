package com.anhtrt.instagramclone.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feed")
public class FeedController {
    @GetMapping
    public void getFeed(){}
}
