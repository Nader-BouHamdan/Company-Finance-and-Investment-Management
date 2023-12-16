package com.companymanagement.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Collateral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long collateralID;
    private Long amount;
    private Long i = (long) 0;

    public Collateral(Long collateralID, Long amount) {
        this.collateralID = i++;
        this.amount = amount;
    }

    public Long getCollateralID() {
        return collateralID;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
    
}
