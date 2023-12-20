package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Stocks;

public interface StocksService {
    String createStocks(Stocks Stocks);
    String updateStocks(Stocks Stocks);
    String deleteStocks(Long StocksId);
    Stocks getStocks(Long StocksId);
    List<Stocks> getAllStockss();
}

