package com.cursopoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursopoo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
