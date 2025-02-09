package com.example.notes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notes.models.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	 Optional<User> findByEmail(String email);
	 
	 boolean existsByEmail(String email);
}
