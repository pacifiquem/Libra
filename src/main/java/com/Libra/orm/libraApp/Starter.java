package com.Libra.orm.libraApp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import rw.ac.rca.smis.orm.Address;
import rw.ac.rca.smis.orm.Course;
import rw.ac.rca.smis.orm.Instructor;
import rw.ac.rca.smis.orm.Mark;
import rw.ac.rca.smis.orm.Student;

import java.util.*;

public class Starter {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println("=== Opening session ===");


        @SuppressWarnings("deprecation")
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("=== Beginning transaction ===");
        Transaction transaction = session.beginTransaction();

        //saving object
        session.saveOrUpdate();

        transaction.commit();
        session.close();
        factory.close();

    }
}
