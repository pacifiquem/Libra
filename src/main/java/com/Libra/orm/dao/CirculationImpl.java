package com.Libra.orm.dao;

import com.Libra.orm.Catalogue;
import com.Libra.orm.Patron;
import org.hibernate.SessionFactory;

import java.util.List;

public class CirculationImpl implements CirculationDAO {

    private SessionFactory sessionFactory;

    @Override
    public List<Patron> getAllLenders() {
        return sessionFactory.getCurrentSession().createQuery("from patron").list();
    }

    @Override
    public List<Catalogue> getLentBooks() {
        return sessionFactory.getCurrentSession().createQuery("from catalogue").list();
    }
}
