package com.circlit.controllers;

import com.circlit.models.User;
import com.circlit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@Validated
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //TODO: Have to figure out how to use validation for Objects
    @PostMapping("/user/createUser")
    public ResponseEntity createUser(@Valid @RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

//    @PutMapping("/user/updatePassword")
//    public ResponseEntity updatePassword(@RequestParam String userId,
//                                         @RequestParam(name = "oldPassword") String oldPassword,
//                                         @RequestParam(value="newPassword") String newPassword) {
//        //TODO: do a proper Validation.. does the userId exist in the database?
//        //TODO: implement this... find a better way to do it
//    }
}
