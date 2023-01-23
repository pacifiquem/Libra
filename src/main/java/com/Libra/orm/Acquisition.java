package com.Libra.orm;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.*;

@Entity
@Table(name = "acquisition")
public class Acquisition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "acquisition")
    private List<Book> books;
    public Acquisition(List<Book> books, LocalDate purchaseDate, BigDecimal cost, Librarian librarian) {
        this.books = books;
        this.purchaseDate = purchaseDate;
        this.cost = cost;
        this.librarian = librarian;
    }

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "cost")
    private BigDecimal cost;

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }



    // Additional fields, getters and setters
}





