package com.anhtrt.instagramclone.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "photos_tags")
public class PhotoTag implements Serializable {
    @Id
    private long photoId;
    @Id
    private long tagId;
}
