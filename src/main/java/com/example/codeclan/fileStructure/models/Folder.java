package com.example.codeclan.fileStructure.models;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private User user;
    private List<File> files;

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
}
