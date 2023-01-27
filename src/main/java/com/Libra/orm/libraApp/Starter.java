package com.Libra.orm.libraApp;

import com.Libra.orm.Administrator;
import com.Libra.orm.Patron;
import com.Libra.orm.dao.AdministratorDAO;
import com.Libra.orm.dao.AdministratorImpl;
import com.Libra.orm.dao.PatronDAO;
import com.Libra.orm.dao.PatronImpl;

import java.util.Date;

public class Starter {
    public static void main(String[] args){
        AdministratorDAO administratorDAO = new AdministratorImpl();
        PatronDAO patronDAO = new PatronImpl();

        Administrator administrator = new Administrator("john", "doe", new Date()
                     ,"1028384","Admin", "johndoe@example.com");
        Patron patron = new Patron("john", "doe",
                "johndoe@example.com", "8953498539", "user");

        administratorDAO.addAdministrator(administrator);
        patronDAO.addPatron(patron);

        Administrator administrator1 = administratorDAO.getAdministrator(1);
        System.out.println(administrator1.getFirstname());

        Patron patron1 = patronDAO.getPatron(patron.getId());
        System.out.println(patron1.getFirstname());
    }

}
