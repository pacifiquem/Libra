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

<<<<<<< HEAD
=======
<<<<<<< HEAD
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
=======
>>>>>>> f2ae34d145604528fcab4244bfa32c52f23784e0
//    private User user;
>>>>>>> d3c7ddbb89d1f606c61fc857a28cc36ef90912c9

    // Getters and setters
    // ...

<<<<<<< HEAD
    public Report() {
=======
    public Report(String reportName, String reportType, Date generationDate, String parameters) {
        this.reportName = reportName;
        this.reportType = reportType;
        this.generationDate = generationDate;
        this.parameters = parameters;
>>>>>>> f2ae34d145604528fcab4244bfa32c52f23784e0

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
