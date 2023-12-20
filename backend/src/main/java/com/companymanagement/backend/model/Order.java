package com.companymanagement.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id", nullable = false)
    private Long logID;

    @Column(name = "buySell", nullable = false)
    private String orderType;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stocks stocks;

    public Order() {
    }

    public Order(String orderType, Long quantity) {
        this.orderType = orderType;
        this.quantity = quantity;
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


}
