package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Trades;
import com.companymanagement.backend.repository.TradesRepository;
import com.companymanagement.backend.service.TradesService;

@Service
public class TradesServiceImplement implements TradesService {

    @Autowired
    private TradesRepository TradesRepository;

    // private final JdbcTemplate jdbcTemplate;

    // @Autowired
    // TradesServiceImplement(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

    // public void selectAllTrades() {
    //     String sql = "SELECT * FROM investment_management_system.tbl_trades;";
    //     jdbcTemplate.queryForList(sql);
    // }

    @Override
    public String createTrades(Trades Trades) {
        TradesRepository.save(Trades);
        return "Successfully created";
    }

    @Override
    public String deleteTrades(Long TradesId) {
        TradesRepository.deleteById(TradesId);
        return "Successfully deleted";
    }

    @Override
    public List<Trades> getAllTradess() {
        return TradesRepository.findAll();
    }

    @Override
    public Trades getTrades(Long TradesId) {
        return TradesRepository.findById(TradesId).get();
    }

    @Override
    public String updateTrades(Trades Trades) {
        TradesRepository.save(Trades);
        return "Successfully updated";
    }
}
