package com.Libra.dao;
import java.util.*;

public interface CirculationInterface {
    void lentBook();
    void returnedBook();
    String lend(String bookName, Date borrowDate, Date returnDate);


}
