package com.Libra.orm.dao;

import com.Libra.orm.Administrator;
import com.Libra.orm.Patron;

import java.util.List;
import java.util.Optional;

public interface PatronDAO{
    public void addPatron(Patron patron);

    public List<Patron> getAllPatrons();

    public void deletePatron(Integer id);

    public Patron updatePatron(Patron patron);

    public Optional<Patron> getPatron(int id);
}
