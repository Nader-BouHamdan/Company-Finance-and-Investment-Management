package com.companymanagement.backend.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long portfolioID;
    private final Date createdDate;
    private Long i = (long) 0;

    public Portfolio(Long portfolioID, Date createdDate) {
        this.portfolioID = i++;
        this.createdDate = createdDate;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    
}
