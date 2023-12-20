package com.companymanagement.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.companymanagement.backend.model.Stocks;

public interface StocksRepository extends CrudRepository<Stocks, Long>{
 
}
