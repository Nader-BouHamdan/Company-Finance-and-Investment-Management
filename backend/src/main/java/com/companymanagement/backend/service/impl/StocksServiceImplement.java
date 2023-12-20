package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Stocks;
import com.companymanagement.backend.repository.StocksRepository;
import com.companymanagement.backend.service.StocksService;

@Service
public class StocksServiceImplement implements StocksService {

    @Autowired
    private StocksRepository StocksRepository;

    @Override
    public String createStocks(Stocks Stocks) {
        StocksRepository.save(Stocks);
        return "Successfully created";
    }

    @Override
    public String deleteStocks(Long StocksId) {
        StocksRepository.deleteById(StocksId);
        return "Successfully deleted";
    }

    @Override
    public List<Stocks> getAllStockss() {
        return (List<Stocks>) StocksRepository.findAll();
    }

    @Override
    public Stocks getStocks(Long StocksId) {
        return StocksRepository.findById(StocksId).get();
    }

    @Override
    public String updateStocks(Stocks Stocks) {
        StocksRepository.save(Stocks);
        return "Successfully updated";
    }
}
