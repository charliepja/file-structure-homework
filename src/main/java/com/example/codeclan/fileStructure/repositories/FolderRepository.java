package com.example.codeclan.fileStructure.repositories;

import com.example.codeclan.fileStructure.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
