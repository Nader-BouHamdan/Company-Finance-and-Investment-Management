package com.companymanagement.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.companymanagement.backend.model.Order;
import com.companymanagement.backend.service.OrderService;

@RestController
@RequestMapping("/Order")
public class OrderController {

    OrderService OrderService;

    public OrderController(OrderService OrderService) {
        this.OrderService = OrderService;
    }

    @GetMapping("/{OrderID}")
    public ResponseEntity<String> getOrderDetails(@PathVariable Long OrderID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<Order> getAllOrderDetails() {
        return OrderService.getAllOrders();
    }

    @PostMapping
    public ResponseEntity<String> createOrderDetails(@RequestBody Order Order){
        OrderService.createOrder(Order);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateOrderDetails(@RequestBody Order Order){
        OrderService.updateOrder(Order);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{OrderID}")
    public ResponseEntity<String> deleteOrderDetails(@PathVariable Long OrderID){
        OrderService.deleteOrder(OrderID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
