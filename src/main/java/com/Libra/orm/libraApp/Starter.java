package com.Libra.orm.libraApp;

import com.Libra.orm.Administrator;
import com.Libra.orm.Patron;
import com.Libra.orm.dao.AdministratorDAO;
import com.Libra.orm.dao.AdministratorImpl;
import com.Libra.orm.dao.PatronDAO;
import com.Libra.orm.dao.PatronImpl;

import java.util.Date;

import com.Libra.orm.Catalogue;

import com.Libra.orm.Patron;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;

public class Starter {
    public static void main(String[] args){
        AdministratorImpl administratorDAO = new AdministratorImpl();
        PatronDAO patronDAO = new PatronImpl();

        Administrator administrator = new Administrator("john", "doe", new Date()
                ,"1028384","Admin", "johndoe@example.com");
        Patron patron = new Patron("john", "doe",
                "johndoe@example.com", "8953498539", "user");
        patron.setDob(new Date());

        administratorDAO.addAdministrator(administrator);
        patronDAO.addPatron(patron);

        Optional<Administrator> administrator1  = administratorDAO.getAdministrator(1);
        System.out.println(administrator1);

        Optional<Patron> patron1 = patronDAO.getPatron(1);
        System.out.println(patron1);

        patronDAO.deletePatron(patron.getId());
        administratorDAO.deleteAdministrator(administrator.getId());

    }

}
