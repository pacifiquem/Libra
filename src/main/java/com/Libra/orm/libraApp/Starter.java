package com.Libra.orm.libraApp;

import com.Libra.orm.Administrator;
import com.Libra.orm.Patron;
import com.Libra.orm.dao.AdministratorDAO;
import com.Libra.orm.dao.AdministratorImpl;
import com.Libra.orm.dao.PatronDAO;
import com.Libra.orm.dao.PatronImpl;

import java.util.Date;

<<<<<<< HEAD
=======
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

>>>>>>> d3c7ddbb89d1f606c61fc857a28cc36ef90912c9
public class Starter {
    public static void main(String[] args){
        AdministratorDAO administratorDAO = new AdministratorImpl();
        PatronDAO patronDAO = new PatronImpl();

        Administrator administrator = new Administrator("john", "doe", new Date()
                     ,"1028384","Admin", "johndoe@example.com");
        Patron patron = new Patron("john", "doe",
                "johndoe@example.com", "8953498539", "user");

<<<<<<< HEAD
        administratorDAO.addAdministrator(administrator);
        patronDAO.addPatron(patron);

        Administrator administrator1 = administratorDAO.getAdministrator(1);
        System.out.println(administrator1.getFirstname());
=======
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
>>>>>>> d3c7ddbb89d1f606c61fc857a28cc36ef90912c9

        Patron patron1 = patronDAO.getPatron(patron.getId());
        System.out.println(patron1.getFirstname());
    }

}
