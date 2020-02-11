package com.example.codeclan.fileStructure.models;


import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column
    private String name;

    @Column
    private String extension;

    @Column
    private int size;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return this.folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
