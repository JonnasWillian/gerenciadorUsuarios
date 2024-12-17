package com.gerenciamento.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamento.gerenciamento.model.UserSystem;

@Repository
public interface UserRepository extends JpaRepository<UserSystem, Long>{
    
}
