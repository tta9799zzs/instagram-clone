package com.anhtrt.instagramclone.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "likes")
public class Like implements Serializable {
    @Id
    private long userId;
    @Id
    private long photoId;
    @CreatedDate
    private Instant dateCreated;
    @LastModifiedDate
    private Instant dateUpdated;
}
