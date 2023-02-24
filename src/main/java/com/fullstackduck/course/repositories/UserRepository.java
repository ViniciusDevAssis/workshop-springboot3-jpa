package com.fullstackduck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackduck.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
