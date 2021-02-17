package com.anhtrt.instagramclone.services;

import com.anhtrt.instagramclone.dto.PostRequest;
import com.anhtrt.instagramclone.repositorys.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@AllArgsConstructor
@Transactional
public class PostService {
    final PostRepository postRepository;
    final ImageService imageService;
    final AuthService authService;

    public void addPost(PostRequest postRequest, MultipartFile imageFile) throws IOException {
        long imageId = imageService.uploadImage(imageFile);
//        postRepository.save(postMapper.map(postRequest,authService.getCurrentUser(), imageId));
    }
}
