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
import com.companymanagement.backend.model.Stocks;
import com.companymanagement.backend.service.StocksService;

@RestController
@RequestMapping("/investment_management_system/Stocks")
public class StocksController {

    StocksService StocksService;

    public StocksController(StocksService StocksService) {
        this.StocksService = StocksService;
    }

    @GetMapping("/{StocksID}")
    public ResponseEntity<String> getStocksDetails(@PathVariable Long StocksID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<Stocks> getAllStocksDetails() {
        return StocksService.getAllStockss();
    }

    @PostMapping
    public ResponseEntity<String> createStocksDetails(@RequestBody Stocks Stocks){
        StocksService.createStocks(Stocks);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateStocksDetails(@RequestBody Stocks Stocks){
        StocksService.updateStocks(Stocks);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{StocksID}")
    public ResponseEntity<String> deleteStocksDetails(@PathVariable Long StocksID){
        StocksService.deleteStocks(StocksID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
