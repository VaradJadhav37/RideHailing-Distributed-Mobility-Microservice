package com.example.UserService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String role; // DRIVER or RIDER
}