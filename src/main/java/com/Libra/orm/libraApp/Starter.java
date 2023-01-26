package com.Libra.orm.libraApp;

import java.util.Date;

import com.Libra.orm.Book;
<<<<<<< HEAD
import com.Libra.orm.Catalogue;
=======
import com.Libra.orm.Circulation;
>>>>>>> f2ae34d145604528fcab4244bfa32c52f23784e0
import com.Libra.orm.Patron;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;

public class Starter {

    public static void main(String[] args) {

<<<<<<< HEAD
        Catalogue catalogue = new Catalogue("book1", "Aline", "12345", "Aline", new Date(), 12, "romance", "simple desc", 12, 10);
=======
        Patron patron = new Patron("Jane", "Doe", "+250789012345", "user");
        Book book = new Book("Title2", "The fault in our stars", "John Doe", 205, new Date(), "available" );
        patron.setDob(new Date());
        patron.setEmail("janedoe@example.com");
>>>>>>> f2ae34d145604528fcab4244bfa32c52f23784e0

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println("=== Opening session ===");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("=== Beginning transaction ===");
        Transaction transaction = session.beginTransaction();

        //saving object
        session.saveOrUpdate(catalogue);
        transaction.commit();
        session.close();
        factory.close();

    }
}
