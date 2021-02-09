package com.anhtrt.instagramclone.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String saltedPassword;
    private String firstName;
    private String lastName;
    private String last_ip;
    @CreatedDate
    private Instant dateCreated;
    @LastModifiedDate
    private Instant dateUpdated;
}
