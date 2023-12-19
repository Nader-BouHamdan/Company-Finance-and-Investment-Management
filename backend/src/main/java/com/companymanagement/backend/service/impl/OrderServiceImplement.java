package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Order;
import com.companymanagement.backend.repository.OrderRepository;
import com.companymanagement.backend.service.OrderService;

@Service
public class OrderServiceImplement implements OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    @Override
    public String createOrder(Order Order) {
        OrderRepository.save(Order);
        return "Successfully created";
    }

    @Override
    public String deleteOrder(Long OrderId) {
        OrderRepository.deleteById(OrderId);
        return "Successfully deleted";
    }

    @Override
    public List<Order> getAllOrders() {
        return (List<Order>) OrderRepository.findAll();
    }

    @Override
    public Order getOrder(Long OrderId) {
        return OrderRepository.findById(OrderId).get();
    }

    @Override
    public String updateOrder(Order Order) {
        OrderRepository.save(Order);
        return "Successfully updated";
    }
}
