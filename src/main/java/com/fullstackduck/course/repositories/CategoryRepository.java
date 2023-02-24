package com.fullstackduck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackduck.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
