package com.calcme.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calcme.lucas.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	// banco de dados
	
}
