package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Order;

public interface OrderService {
    String createOrder(Order Order);
    String updateOrder(Order Order);
    String deleteOrder(Long OrderId);
    Order getOrder(Long OrderId);
    List<Order> getAllOrders();
}

