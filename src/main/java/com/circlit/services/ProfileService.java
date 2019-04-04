package com.circlit.services;

import com.circlit.models.Profiles;
import com.circlit.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) { this.profileRepository = profileRepository; }

    public void create(Profiles profiles) {
        profileRepository.save(profiles);
    }

}
