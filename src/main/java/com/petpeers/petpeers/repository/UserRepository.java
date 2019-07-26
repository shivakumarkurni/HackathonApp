package com.petpeers.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.petpeers.petpeers.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	String findByUserPassword();

	static Object findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
