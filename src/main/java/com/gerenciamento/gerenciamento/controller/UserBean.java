package com.gerenciamento.gerenciamento.controller;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import com.gerenciamento.gerenciamento.model.UserSystem;

import java.util.List;

@Component("userBean")
@Scope("request")
public class UserBean {
    private List<UserSystem> users;

    public List<UserSystem> getUsers() {
        if (users == null) {
            try {
                RestTemplate restTemplate = new RestTemplate();
                String apiUrl = "http://localhost:8080/api/users";
                UserSystem[] userArray = restTemplate.getForObject(apiUrl, UserSystem[].class);
                users = (userArray != null) ? List.of(userArray) : List.of();
            } catch (Exception e) {
                System.err.println("Erro ao conectar ao backend: " + e.getMessage());
                users = List.of();
            }
        }
        return users;
    }
}