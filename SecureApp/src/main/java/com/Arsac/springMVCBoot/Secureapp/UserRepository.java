package com.Arsac.springMVCBoot.Secureapp;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
