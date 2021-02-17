package com.anhtrt.instagramclone.controllers;

import com.anhtrt.instagramclone.dto.AuthenticationResponse;
import com.anhtrt.instagramclone.dto.LoginRequest;
import com.anhtrt.instagramclone.dto.RegisterRequest;
import com.anhtrt.instagramclone.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth/")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @PostMapping("/verify/{token}")
    public ResponseEntity<String> verify() {
        return new ResponseEntity<>("", OK);
    }

    @PostMapping("/send_email")
    public ResponseEntity<String> sendEmail() {
        return new ResponseEntity<>("", OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return new ResponseEntity<>("", OK);
    }

    @PostMapping("/refresh/token")
    public boolean refreshTokens() {
        return true;
    }
}
