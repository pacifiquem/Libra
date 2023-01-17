package com.Libra.orm;

import java.util.Date;

public interface CirculationInterface {
    void lentBook();
    void returnedBook();
    String lend(String bookName, Date borrowDate, Date returnDate);


}
