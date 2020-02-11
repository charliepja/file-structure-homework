package com.example.codeclan.fileStructure.controller;

import com.example.codeclan.fileStructure.models.File;
import com.example.codeclan.fileStructure.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class FileController {

    @Autowired
    FileRepository fileRepository;


    @GetMapping(name = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(name = "/files/{id}")
    public ResponseEntity<Optional<File>> getFileById(@PathVariable Long id) {
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(name = "/files")
    public ResponseEntity createNewFile(@RequestBody File newFile) {
        fileRepository.save(newFile);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
