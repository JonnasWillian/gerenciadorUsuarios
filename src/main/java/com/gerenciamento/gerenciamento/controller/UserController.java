package com.gerenciamento.gerenciamento.controller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamento.gerenciamento.model.UserSystem;
import com.gerenciamento.gerenciamento.repository.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@Component
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public List<UserSystem> list () {
        return userRepository.findAll();
    }
}
