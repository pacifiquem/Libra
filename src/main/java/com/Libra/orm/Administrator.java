package com.Libra.orm;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "administrator")
public class Administrator extends Person{
    public Administrator(String firstName, String lastName, Date date, String phoneNumber, String role, String email) {
        this.setFirstname(firstName);
        this.setLastname(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setRole(role);
        this.setDob(date);
    }

}
