package com.fullstackduck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackduck.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
