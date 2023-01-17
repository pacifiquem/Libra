package com.Libra.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {

    public Book(String title, String name, String author, int bookNum, Date pubDate){
        this.title = title;
        this.name = name;
        this.author = author;
        this.bookNum = bookNum;
        this.pubDate = pubDate;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String name;
    private String author;
    private int bookNum;
    private Date pubDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
