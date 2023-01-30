package com.Libra.orm.dao;

import com.Libra.orm.Administrator;
import com.Libra.orm.Patron;
import com.Libra.orm.util.*;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

import static com.Libra.orm.dao.DAO.getSession;

public class PatronImpl extends DAO implements PatronDAO{

    @Override
    public void addPatron(Patron patron) {
        try{
            begin();
            getSession().saveOrUpdate(patron);
            commit();
        } catch (Exception e) {
            rollback();
        }
    }

    @Override
    public List<Patron> getAllPatrons() {
        try{
            begin();
            Query query = getSession().createQuery("from patron");
            List <Patron> patrons = query.list();
            commit();
            return patrons;
        }catch(Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public void deletePatron(Integer id) {
        Patron patron = null;
        try{
            begin();
            patron = (Patron) getSession().get(Patron.class, id);
            getSession().delete(patron);
        }catch(Exception e){
            rollback();
        }
    }

    @Override
    public Patron updatePatron(Patron patron) {
        return null;
    }

    @Override
    public Optional<Patron> getPatron(int id) {
        try {
            begin();
            Patron patron = (Patron) getSession().get(Patron.class, id);
            return Optional.ofNullable(patron);
        } catch (Exception e) {
            rollback();
            return null;
        }
    }
}
