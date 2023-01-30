package com.Libra.orm.dao;

import com.Libra.orm.Administrator;

import java.util.List;

public interface AdministratorDAO {
    public void addAdministrator(Administrator administrator);

    public List<Administrator> getAllAdministrators();

    public void deleteAdministrator(Integer id);

    public Administrator updateAdministrator(Administrator administrator);

    public Administrator getAdministrator(int id);
}
