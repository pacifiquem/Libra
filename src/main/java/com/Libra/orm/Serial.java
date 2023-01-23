package com.Libra.orm;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "serials")
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "issn", unique = true)
    private String issn;

    @OneToMany(mappedBy = "serial")
    private List<Issue> issues;
    // Additional fields, getters and setters
}