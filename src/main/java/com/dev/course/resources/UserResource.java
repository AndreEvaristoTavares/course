package com.dev.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.course.entities.User;

@RestController
@RequestMapping(value = "users")
public class UserResource {
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "andre", "andre@and.com", "1199999-9999", "1234567");
        return ResponseEntity.ok().body(user);
        
    }
}
