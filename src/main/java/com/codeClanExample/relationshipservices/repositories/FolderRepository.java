package com.codeClanExample.relationshipservices.repositories;

import com.codeClanExample.relationshipservices.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
