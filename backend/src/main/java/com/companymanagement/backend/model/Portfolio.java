package com.companymanagement.backend.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_portfolio")
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id", nullable = false)
    private Long portfolioID;

    @Column(name = "portfolio_name", nullable = false)
    private String portfolioName;

    @Column(name = "dateOfCreation", nullable = false)
    private Date createdDate;

    @Column(name = "totalValue", nullable = false)
    private Long totalValue;
    
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company comapny;


    public Portfolio(String portfolioName,Date createdDate, Long totalValue, Company company) {
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.totalValue = totalValue;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Long totalValue) {
        this.totalValue = totalValue;
    }
    
}
