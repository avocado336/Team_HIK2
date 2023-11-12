package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);

	default void insert(User user) {
		if (findByEmail(user.getEmail()) == null) {
			// Email does not exist, proceed with the insertion
			save(user);
		} else {
			// Email already exists, handle accordingly
		}
	}
}