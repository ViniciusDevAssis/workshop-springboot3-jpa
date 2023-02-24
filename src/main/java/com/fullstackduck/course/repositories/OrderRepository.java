package com.fullstackduck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackduck.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
