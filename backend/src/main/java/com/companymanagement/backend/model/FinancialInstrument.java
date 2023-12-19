package com.companymanagement.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_financialInstrument")
public class FinancialInstrument {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_id", nullable = false)
    private Long instrumentID;

    @Column(name = "typeFin", nullable = false)
    private String instrumentType;// equity debt derivative

    @Column(name = "issuer", nullable = false)
    private String issuer;

    @Column(name= "price", nullable = false)
    private Long price;
    
    public FinancialInstrument(String instrumentType, String issuer, Long price) {
        this.instrumentType = instrumentType;
        this.issuer = issuer;
        this.price = price;
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

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    

}
