package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String umail);
}
