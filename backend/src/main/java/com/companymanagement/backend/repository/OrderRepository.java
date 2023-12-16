package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
 
}
