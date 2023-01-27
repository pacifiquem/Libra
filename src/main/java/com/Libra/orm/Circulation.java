package com.Libra.orm;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


public class Circulation{

    public Circulation(int bookId, String bookName, int borrowerId, String borrowerName, Date borrowDate, Date dueDate, double borrowFine){
        this.bookId = bookId;
        this.bookName = bookName;
        this.borrowerId = borrowerId;
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.borrowFine = borrowFine;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private int bookId; //book id ( as in book db )
    private String bookName; //book name ( as in book db)
    private Date borrowDate;
    private Date dueDate;
    private double borrowFine; //amt charged
    private int borrowerId; //patron id (as in db)
    private String borrowerName; // patron name (as in db)



    public List<Catalogue> lentBook(){
        //list of lent books
        return null;
    }
    public void returnedBook(){
        //list of returned books
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getBorrowFine() {
        return borrowFine;
    }

    public void setBorrowFine(double borrowFine) {
        this.borrowFine = borrowFine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }
}


//Circulation: This class handles the lending and returning of library materials to patrons.
// It keeps track of due dates, fines, and holds, and can generate reports on circulation statistics.