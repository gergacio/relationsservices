package com.codeClanExample.relationshipservices.repositories;

import com.codeClanExample.relationshipservices.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
