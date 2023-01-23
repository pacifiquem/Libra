package com.Libra.orm;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "patron")
public class Patron extends Person {

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "patron")
    private List<Book> books;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "patron")
    private List<Serial>serials;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "patron")
    private List<Loan>loans;


    public Patron(Date date,String firstName, String lastName,String email,String phoneNumber) {
        super(date,firstName,lastName,email,phoneNumber);
    }

}
