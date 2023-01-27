package com.Libra.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class LibraSessionFactory {

    private static SessionFactory sessionFactory;
    private static StandardServiceRegistryBuilder serviceRegistryBuilder;
    private static String configFile = "hibernate.cfg.xml";
    private static Configuration configuration;
    private static ServiceRegistry serviceRegistry;

    private LibraSessionFactory() {
    }

    private static SessionFactory getInstance() throws HibernateException{
        if (sessionFactory == null) {
            configuration = new Configuration();
            serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            configuration.configure(configFile);
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            serviceRegistry = serviceRegistryBuilder.build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    public static Session getSession() {
        Session session = getInstance().getCurrentSession();
        if (session == null || !session.isOpen()) {
            session = getInstance().openSession();
        }
        return session;
    }

}
