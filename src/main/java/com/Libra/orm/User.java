package com.Libra.orm;
import java.util.*;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    // Getters and setters
    // ...

    public void authenticate(String username, String password) {
        // Code to authenticate the user based on the provided username and password
    }

    public void isAuthorized(String role) {
        // Code to check if the user is authorized to perform a specific action based on their role
    }
}

