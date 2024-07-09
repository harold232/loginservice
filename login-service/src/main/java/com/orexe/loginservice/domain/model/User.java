package com.orexe.loginservice.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String username;
    private String password;
    private String telefono;

    public User() {
    }

    public String getName() {
        return name;
    }
}
