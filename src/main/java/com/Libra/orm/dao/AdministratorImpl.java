package com.Libra.orm.dao;

import com.Libra.orm.Administrator;
import com.Libra.orm.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public class AdministratorImpl extends DAO implements AdministratorDAO{


    @Override
    public void addAdministrator(Administrator administrator) {
        try{
            begin();
            getSession().saveOrUpdate(administrator);
            commit();
        } catch (Exception e) {
            rollback();
        }
    }

    @Override
    public List<Administrator> getAllAdministrators() {
        try{
            begin();
            Query query = getSession().createQuery("from administrator");
            List <Administrator> administrators = query.list();
            commit();
            return administrators;
        }catch(Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public void deleteAdministrator(Integer id) {
        Administrator administrator;
        try{
            begin();
            administrator = (Administrator) getSession().get(Administrator.class, id);
            getSession().delete(administrator);
        }catch(Exception e){
            rollback();
        }
    }

    @Override
    public Administrator updateAdministrator(Administrator administrator) {
        return null;
    }

    @Override
    public Optional <Administrator> getAdministrator(int id) {
        try {
            begin();
            Administrator administrator = (Administrator) getSession().get(Administrator.class, id);
            return Optional.ofNullable(administrator);
        } catch (Exception e) {
            rollback();
            return null;
        }
    }
}
