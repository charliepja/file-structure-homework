package com.example.codeclan.fileStructure.controller;

import com.example.codeclan.fileStructure.models.User;
import com.example.codeclan.fileStructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity createNewUser(@RequestBody User newUser) {
        userRepository.save(newUser);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
