package com.companymanagement.backend.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long logID;
    private final String orderType;
    private final Long quantity;
    private final Long price;
    private Long i = (long) 0;

    public Order(String orderType, Long quantity, Long price) {
        this.logID = i++;
        this.orderType = orderType;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getLogID() {
        return logID;
    }

    public String getOrderType() {
        return orderType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getPrice() {
        return price;
    }

}
