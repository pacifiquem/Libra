package com.Libra.orm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patron")
public class Patron extends Person {

    public Patron(String firstName, String lastName,String phoneNumber, String role) {
        this.setFirstname(firstName);
        this.setLastname(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setRole(role);
    }

}
