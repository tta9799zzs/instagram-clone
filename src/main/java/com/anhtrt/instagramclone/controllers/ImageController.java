package com.anhtrt.instagramclone.controllers;

import com.anhtrt.instagramclone.services.ImageService;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@RestController
@RequestMapping("/api/images")
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public void uploadImage(@RequestParam MultipartFile imageFile) throws IOException {
        imageService.uploadImage(imageFile);
    }

    @GetMapping("/{imageId}")
    public Resource downloadImage(@PathVariable long imageId) throws Exception {
         return imageService.downloadImage(imageId);
    }
}
