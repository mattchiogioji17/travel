package com.chio.frontend.repository;

import org.springframework.data.repository.CrudRepository;

import com.chio.frontend.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
