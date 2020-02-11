package com.example.codeclan.fileStructure.components;

import com.example.codeclan.fileStructure.models.File;
import com.example.codeclan.fileStructure.models.Folder;
import com.example.codeclan.fileStructure.models.User;
import com.example.codeclan.fileStructure.repositories.FileRepository;
import com.example.codeclan.fileStructure.repositories.FolderRepository;
import com.example.codeclan.fileStructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Charlie");
        User user2 = new User("Matthew");
        User user3 = new User("Thomas");
        User user4 = new User("Max");
        User user5 = new User("Zach");

        Folder documents1 = new Folder("Documents", user1);
        Folder documents2 = new Folder("Documents", user2);
        Folder documents3 = new Folder("Documents", user3);
        Folder documents4 = new Folder("Documents", user4);
        Folder documents5 = new Folder("Documents", user5);

        Folder downloads1 = new Folder("Downloads", user1);
        Folder downloads2 = new Folder("Downloads", user2);
        Folder downloads3 = new Folder("Downloads", user3);
        Folder downloads4 = new Folder("Downloads", user4);
        Folder downloads5 = new Folder("Downloads", user5);

        Folder movies1 = new Folder("Movies", user1);
        Folder movies2 = new Folder("Movies", user2);
        Folder movies3 = new Folder("Movies", user3);
        Folder movies4 = new Folder("Movies", user4);
        Folder movies5 = new Folder("Movies", user5);

        File selfie1 = new File("selfie", "jpg", 350, documents1);
        File selfie2 = new File("selfie", "jpg", 350, documents2);
        File selfie3 = new File("selfie", "jpg", 350, documents3);
        File selfie4 = new File("selfie", "jpg", 350, documents4);
        File selfie5 = new File("selfie", "jpg", 350, documents5);

        File homework1 = new File("homework", "docx", 100, documents1);
        File homework2 = new File("homework", "docx", 100, documents2);
        File homework3 = new File("homework", "docx", 100, documents3);
        File homework4 = new File("homework", "docx", 100, documents4);
        File homework5 = new File("homework", "docx", 100, documents5);

        File app1 = new File("app", "exe", 200, downloads1);
        File app2 = new File("app", "exe", 200, downloads2);
        File app3 = new File("app", "exe", 200, downloads3);
        File app4 = new File("app", "exe", 200, downloads4);
        File app5 = new File("app", "exe", 200, downloads5);

        File discord1 = new File("discord", "exe", 500, downloads1);
        File discord2 = new File("discord", "exe", 500, downloads2);
        File discord3 = new File("discord", "exe", 500, downloads3);
        File discord4 = new File("discord", "exe", 500, downloads4);
        File discord5 = new File("discord", "exe", 500, downloads5);

        File movie1 = new File("The Avengers", "mp4", 1024, movies1);
        File movie2 = new File("The Avengers", "mp4", 1024, movies2);
        File movie3 = new File("The Avengers", "mp4", 1024, movies3);
        File movie4 = new File("The Avengers", "mp4", 1024, movies4);
        File movie5 = new File("The Avengers", "mp4", 1024, movies5);

        File movie11 = new File("Captain America", "mp4", 1024, movies1);
        File movie12 = new File("Captain America", "mp4", 1024, movies2);
        File movie13 = new File("Captain America", "mp4", 1024, movies3);
        File movie14 = new File("Captain America", "mp4", 1024, movies4);
        File movie15 = new File("Captain America", "mp4", 1024, movies5);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);

        folderRepository.save(documents1);
        folderRepository.save(documents2);
        folderRepository.save(documents3);
        folderRepository.save(documents4);
        folderRepository.save(documents5);

        folderRepository.save(downloads1);
        folderRepository.save(downloads2);
        folderRepository.save(downloads3);
        folderRepository.save(downloads4);
        folderRepository.save(downloads5);

        folderRepository.save(movies1);
        folderRepository.save(movies2);
        folderRepository.save(movies3);
        folderRepository.save(movies4);
        folderRepository.save(movies5);

        fileRepository.save(selfie1);
        fileRepository.save(selfie2);
        fileRepository.save(selfie3);
        fileRepository.save(selfie4);
        fileRepository.save(selfie5);

        fileRepository.save(homework1);
        fileRepository.save(homework2);
        fileRepository.save(homework3);
        fileRepository.save(homework4);
        fileRepository.save(homework5);

        fileRepository.save(app1);
        fileRepository.save(app2);
        fileRepository.save(app3);
        fileRepository.save(app4);
        fileRepository.save(app5);

        fileRepository.save(discord1);
        fileRepository.save(discord2);
        fileRepository.save(discord3);
        fileRepository.save(discord4);
        fileRepository.save(discord5);

        fileRepository.save(movie1);
        fileRepository.save(movie2);
        fileRepository.save(movie3);
        fileRepository.save(movie4);
        fileRepository.save(movie5);

        fileRepository.save(movie11);
        fileRepository.save(movie12);
        fileRepository.save(movie13);
        fileRepository.save(movie14);
        fileRepository.save(movie15);
    }
}
