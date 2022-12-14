package com.codeClanExample.relationshipservices.components;

import com.codeClanExample.relationshipservices.models.File;
import com.codeClanExample.relationshipservices.models.Folder;
import com.codeClanExample.relationshipservices.models.User;
import com.codeClanExample.relationshipservices.repositories.FileRepository;
import com.codeClanExample.relationshipservices.repositories.FolderRepository;
import com.codeClanExample.relationshipservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    //dependency injection - the way how we get staff from outside
    @Autowired
    UserRepository userRepository;
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User("Georgi");
        userRepository.save(user);
        Folder folder = new Folder("exampleFolder",user);
        folderRepository.save(folder);
        File file = new File("example","txt",0.3);
        fileRepository.save(file);

    }
}
