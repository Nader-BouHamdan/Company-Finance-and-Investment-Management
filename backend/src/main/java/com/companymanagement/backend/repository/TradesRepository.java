package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.Trades;

public interface TradesRepository extends JpaRepository<Trades, Long>{
 
}
