package com.anhtrt.instagramclone.services;

import com.anhtrt.instagramclone.models.Image;
import com.anhtrt.instagramclone.repositorys.ImageRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
public class ImageService {
    final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }


    public long uploadImage(MultipartFile multipartFile) throws IOException {
        Image dbImage = new Image();
        dbImage.setName(multipartFile.getOriginalFilename());
        dbImage.setContent(multipartFile.getBytes());

        return imageRepository.save(dbImage)
                .getImageId();
    }

    public Resource downloadImage(long imageId) throws Exception {
        byte[] image=imageRepository.findById(imageId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND))
                .getContent();
        return new ByteArrayResource(image);
    }
}
