package com.demo.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.repositories.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
