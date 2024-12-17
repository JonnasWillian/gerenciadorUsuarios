package com.gerenciamento.gerenciamento;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gerenciamento.gerenciamento.model.UserSystem;
import com.gerenciamento.gerenciamento.repository.UserRepository;

@SpringBootApplication
public class GerenciamentoApplication { 

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoApplication.class, args);
	}

	@Bean
    CommandLineRunner initDataBase(UserRepository userRepository) {
        return args -> {};
    }
}
