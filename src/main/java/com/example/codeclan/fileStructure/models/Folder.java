package com.example.codeclan.fileStructure.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @JsonBackReference
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Folder(String name, User user) {
        this.name = name;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
