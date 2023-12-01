package com.companymanagement.backend.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long tradeID;
    private Date timeStamp;
    private Long price;
    private Long quantity;
    private Long i = (long) 0;

    public Trades(Long tradeID, Date timeStamp, Long price, Long quantity) {
        this.tradeID = i++;
        this.timeStamp = timeStamp;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getTradeID() {
        return tradeID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    
}
