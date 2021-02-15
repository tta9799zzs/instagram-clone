package com.anhtrt.instagramclone.controllers;

import com.anhtrt.instagramclone.dto.PostRequest;
import com.anhtrt.instagramclone.services.PostService;
import com.anhtrt.instagramclone.services.ImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/entries")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public void addPost(@RequestBody PostRequest postRequest, @RequestParam MultipartFile imageFile) throws IOException {
        postService.addPost(postRequest, imageFile);
    }
    @PutMapping
    public void updatePost(){ }
    @GetMapping("/{objectId}")
    public void getPost(){ }
    @GetMapping("/by_user/{userId}")
    public void getPostByUser(){ }
    @GetMapping("/by_tag/{tagId}")
    public void getPostByTag(){ }
    @GetMapping("/by_hashtag/{hashtagId}")
    public void getPostByHashtag(){ }
    @DeleteMapping("/{objectId}")
    public void deletePost(){ }
    @PostMapping("/hide/{objectId}")
    public void hidePost(){ }
    @PostMapping("/unhide/{objectId}")
    public void unhidePost(){ }
}
