package com.fullstackduck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackduck.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
