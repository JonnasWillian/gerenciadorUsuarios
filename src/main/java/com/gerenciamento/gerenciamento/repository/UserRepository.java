package com.gerenciamento.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciamento.gerenciamento.model.UserSystem;

public interface UserRepository extends JpaRepository<UserSystem, Long> {
   
}