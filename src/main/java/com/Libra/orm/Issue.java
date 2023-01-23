package com.Libra.orm;
import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "issues")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name = "volume")
    private int volume;

    @Column(name = "issue_number")
    private int issueNumber;

    @ManyToOne
    @JoinColumn(name = "serial_id")
    private Serial serial;

    public Issue(LocalDate publicationDate, int volume, int issueNumber, Serial serial) {
        this.publicationDate = publicationDate;
        this.volume = volume;
        this.issueNumber = issueNumber;
        this.serial = serial;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }
    // Additional fields, getters and setters
}
