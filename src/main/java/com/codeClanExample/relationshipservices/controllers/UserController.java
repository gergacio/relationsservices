package com.codeClanExample.relationshipservices.controllers;

import com.codeClanExample.relationshipservices.models.User;
import com.codeClanExample.relationshipservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@RestController
public class UserController {
    //dependency injection
    @Autowired
    UserRepository userRepository;

    //SHOW All
    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
    //SHOW BY ID
    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id),HttpStatus.OK);
    }

    //POST
    @PostMapping(value = "/users")
    public ResponseEntity<User> postPirate(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }


}
