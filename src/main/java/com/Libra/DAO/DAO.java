package com.Libra.DAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import  com.Libra.util.LibraSessionFactory;


public class DAO {

    protected DAO() {

    }

    public static Session getSession() {
        return LibraSessionFactory.getSession();
    }

    protected void begin() {
        getSession().beginTransaction();
    }

    protected void commit() {
        getSession().getTransaction().commit();
    }


    protected void rollback() {
        try {
            getSession().getTransaction().rollback();
        } catch (HibernateException e) {
            System.out.println("Cannot rollback: " );
            e.printStackTrace();
        }
        finally{
            close();
        }
    }

    protected void close() {
        try {
            getSession().close();
        } catch (HibernateException e) {
            System.out.println("Cannot close: " + e.toString());
        }
    }

    public void clear() {
        getSession().clear();
    }
    public void flush(){
        getSession().flush();
    }


}
