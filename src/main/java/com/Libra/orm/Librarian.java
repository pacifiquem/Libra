package com.Libra.orm;

import javax.persistence.*;
import java.util.*;

public class  Librarian extends Person{
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", unique = true)
    private Account account;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "librarian")
    private List<Acquisition> acquisitions;

    public List<Acquisition> getAcquisitions() {
        return acquisitions;
    }

    public void setAcquisitions(List<Acquisition> acquisitions) {
        this.acquisitions = acquisitions;
    }

    @Override
    public Account getAccount() {

        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }

    public Librarian(Date dob, String firstname, String lastname, String email, String phoneNumber) {
        super(dob, firstname, lastname, email, phoneNumber);
    }
}
