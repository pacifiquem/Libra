package com.Libra.orm;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="catalogue")
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Catalogue(String title, String author, String ISBN, String publisher, Date publicationDate, int edition, String subject, String description, int numberOfCopies, int availableCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.edition = edition;
        this.subject = subject;
        this.description = description;
        this.numberOfCopies = numberOfCopies;
        this.availableCopies = availableCopies;
    }

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "publication_date")
    private Date publicationDate;

    @Column(name = "edition")
    private int edition;

    @Column(name = "subject")
    private String subject;

    @Column(name = "description")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Column(name = "number_of_copies")
    private int numberOfCopies;

    @Column(name = "available_copies")
    private int availableCopies;


}