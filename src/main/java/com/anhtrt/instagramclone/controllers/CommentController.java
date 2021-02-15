package com.anhtrt.instagramclone.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments/")
public class CommentController {
    @PostMapping
    public void addComment(){}
    @PutMapping
    public void updateComment(){}
    @DeleteMapping
    public void deleteComment(){}
    @GetMapping("/by_photo/{photoId}")
    public void getCommentsByPhoto(){}
    @GetMapping("/by_user/{userId}")
    public void getCommentsByUser(){}
}
