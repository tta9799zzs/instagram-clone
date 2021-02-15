package com.anhtrt.instagramclone.mapper;

import com.anhtrt.instagramclone.dto.PostRequest;
import com.anhtrt.instagramclone.models.Post;
import com.anhtrt.instagramclone.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class PostMapper {
    @Mapping(target = "dateCreated", expression = "java(java.time.Instant.now())")
    @Mapping(target = "dateUpdated", expression = "java(java.time.Instant.now())")
    @Mapping(target = "userId", source = "user.userId")
    @Mapping(target = "imageId", source = "imageId")
    @Mapping(target = "caption", source = "postRequest.caption")
    public abstract Post map(PostRequest postRequest, User user, long imageId);
}
