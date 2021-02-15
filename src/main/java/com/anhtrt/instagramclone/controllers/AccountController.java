package com.anhtrt.instagramclone.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @PutMapping("/edit")
    public void editProfile(){}
    @PutMapping("/password/change")
    public void changePassword(){}
    @PostMapping("/password/reset")
    public void resetPassword(){}
    @PutMapping("/privacy_and_security")
    public void updatePrivacySecurity(){}
    @PutMapping("/emails")
    public void updateEmailSetting(){}
}
