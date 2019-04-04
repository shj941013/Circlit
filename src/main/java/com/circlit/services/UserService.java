package com.circlit.services;

import com.circlit.models.User;
import com.circlit.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        //TODO: check whether the user already exists
        userRepository.save(user);
    }


    public void changePassword(User user, String newPassword) {
        //TODO: have this check with the current password and if so change it to new password
        //TODO: implement this....
        userRepository.save(user);
    }

}
