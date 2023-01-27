package com.Libra.orm;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "patron")
public class Patron extends Person {

    public Patron(String firstName, String lastName, String email, String phoneNumber, String role) {
        this.setFirstname(firstName);
        this.setLastname(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setRole(role);
    }

}


