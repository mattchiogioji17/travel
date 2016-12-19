package com.chio.user.service;

import com.chio.user.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}