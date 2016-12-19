package com.chio.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.chio.user.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
