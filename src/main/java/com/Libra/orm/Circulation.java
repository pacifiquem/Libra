package com.Libra.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface CirculationInterface{
    void lentBook();
    void returnedBook();
     String lend(String bookName, Date borrowDate, Date returnDate);


}
public class Circulation {
    public void lentBook(){
        //list of lent books
    }
    public void returnedBook(){
        //list of returned books
    }
    public String lend(String bookName, Date borrowDate, Date returnDate){
        //
        return bookName;
    }
}