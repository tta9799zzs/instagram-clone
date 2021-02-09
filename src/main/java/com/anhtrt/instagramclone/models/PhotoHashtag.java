package com.anhtrt.instagramclone.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "photos_hashtags")
public class PhotoHashtag implements Serializable {
    @Id
    private long photoId;
    @Id
    private long hashtagId;
}
