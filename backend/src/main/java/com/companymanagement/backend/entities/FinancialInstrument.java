package com.companymanagement.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FinancialInstrument {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long instrumentID;
    private String instrumentType;
    private String asset;
    private Long i = (long) 0;

    public FinancialInstrument(Long instrumentID, String instrumentType, String asset) {
        this.instrumentID = i++;
        this.instrumentType = instrumentType;
        this.asset = asset;
    }

    public Long getInstrumentID() {
        return instrumentID;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

}
