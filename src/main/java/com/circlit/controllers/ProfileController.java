package com.circlit.controllers;

import com.circlit.models.Profiles;
import com.circlit.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/user/profile")
    public ResponseEntity createProfile(@RequestBody Profiles profiles) {

        profileService.create(profiles);

        return new ResponseEntity(HttpStatus.OK);
    }
}
