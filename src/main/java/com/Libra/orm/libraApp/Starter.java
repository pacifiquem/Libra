package com.Libra.orm.libraApp;

import java.util.Date;

import com.Libra.orm.Patron;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;

public class Starter {

    public static void main(String[] args) {

        Patron patron = new Patron("Jane", "Doe", "+250789012345");
        patron.setDob(new Date());
        patron.setEmail("janedoe@example.com");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println("=== Opening session ===");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("=== Beginning transaction ===");
        Transaction transaction = session.beginTransaction();

        //saving object
        session.saveOrUpdate(patron);

        transaction.commit();
        session.close();
        factory.close();

    }
}
