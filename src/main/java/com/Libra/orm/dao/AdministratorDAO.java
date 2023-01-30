package com.Libra.orm.dao;

import com.Libra.orm.Administrator;

import java.util.List;
import java.util.Optional;

public interface AdministratorDAO {
    public void addAdministrator(Administrator administrator);

    public List<Administrator> getAllAdministrators();

    public void deleteAdministrator(Integer id);

    public Administrator updateAdministrator(Administrator administrator);

    public Optional  <Administrator> getAdministrator(int id);
}
