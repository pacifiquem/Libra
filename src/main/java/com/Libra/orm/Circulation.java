package com.Libra.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Circulation implements CirculationInterface {
    public void lentBook(){
        //list of lent books
        //public list<book> getAlllentbooks
    }
    public void returnedBook(){
        //list of returned books
        //public list<book> getAllreturnedbooks
    }
    public String lend(String bookName, Date borrowDate, Date returnDate){
        //
        return bookName;
    }
}


//Circulation: This class handles the lending and returning of library materials to patrons.
// It keeps track of due dates, fines, and holds, and can generate reports on circulation statistics.