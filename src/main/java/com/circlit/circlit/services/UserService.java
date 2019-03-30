package com.circlit.circlit.services;

import com.circlit.circlit.models.User;
import com.circlit.circlit.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private void createUser(User user) {
        userRepository.save(user);
    }


}
