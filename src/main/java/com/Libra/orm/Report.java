package com.Libra.orm;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "generation_date")
    private Date generationDate;

    @Column(name = "parameters")
    private String parameters;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    // Getters and setters
    // ...

    public Report(String reportName, String reportType, Date generationDate, String parameters, User user) {
        this.reportName = reportName;
        this.reportType = reportType;
        this.generationDate = generationDate;
        this.parameters = parameters;
        this.user = user;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void generateBorrowedBooksReport(Date startDate, Date endDate) {
        // Code to generate a report on the number of books borrowed by patrons
        // within a specified date range
    }

    public void generateReturnedBooksReport(Date startDate, Date endDate) {
        // Code to generate a report on the number of books returned
        // within a specified date range
    }

    public void generateOverdueBooksReport() {
        // Code to generate a report on the number of overdue books
    }

    public void generatePopularBooksReport(Date startDate, Date endDate) {
        // Code to generate a report on the most popular books
        // within a specified date range
    }

    public void generateMembershipReport(Date startDate, Date endDate) {
    }
    // Code to generate a

}
