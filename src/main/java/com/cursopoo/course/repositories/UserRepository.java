package com.cursopoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursopoo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
