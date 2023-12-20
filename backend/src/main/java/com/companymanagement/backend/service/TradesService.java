package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Trades;

public interface TradesService {
    String createTrades(Trades Trades);
    String updateTrades(Trades Trades);
    String deleteTrades(Long TradesId);
    Trades getTrades(Long TradesId);
    List<Trades> getAllTradess();
    
}

