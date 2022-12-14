package com.codeClanExample.relationshipservices;

import com.codeClanExample.relationshipservices.models.File;
import com.codeClanExample.relationshipservices.models.Folder;
import com.codeClanExample.relationshipservices.models.User;
import com.codeClanExample.relationshipservices.repositories.FileRepository;
import com.codeClanExample.relationshipservices.repositories.FolderRepository;
import com.codeClanExample.relationshipservices.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipservicesApplicationTests {
	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createFile(){
		File file = new File("example","txt",0.3);
		fileRepository.save(file);
	}
	@Test
	public void createFolder(){
		User user = new User("Georgi");
		userRepository.save(user);
		Folder folder = new Folder("exampleFolder", user);
		folderRepository.save(folder);
	}
	@Test
	public void createUser(){
		User user = new User("Georgi");
		userRepository.save(user);
	}

}
