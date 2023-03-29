package com.cursopoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursopoo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
