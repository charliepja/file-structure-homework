package com.example.codeclan.fileStructure.controller;

import com.example.codeclan.fileStructure.models.Folder;
import com.example.codeclan.fileStructure.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;


    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity<Optional<Folder>> getFolderById(@PathVariable Long id) {
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/folders")
    public ResponseEntity createNewFolder(@RequestBody Folder newFolder) {
        folderRepository.save(newFolder);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
