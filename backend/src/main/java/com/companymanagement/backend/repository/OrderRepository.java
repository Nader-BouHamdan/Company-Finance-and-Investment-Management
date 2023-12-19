package com.companymanagement.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.companymanagement.backend.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
 
}
