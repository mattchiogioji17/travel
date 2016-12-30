package com.chio.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.chio.user.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
