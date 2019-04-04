package com.circlit.controllers;

import com.circlit.models.Item;
import com.circlit.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ItemController {

    @PostMapping("/item/postItem")
    public ResponseEntity postItem(@RequestParam String userId,@RequestBody Item item) {
        //TODO IMPLEMENT THIS
        return new ResponseEntity(HttpStatus.OK);
    }

    //TODO: Implment for delete, update of the items.
}
