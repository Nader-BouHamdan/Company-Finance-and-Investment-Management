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
import com.companymanagement.backend.model.Trades;
import com.companymanagement.backend.service.TradesService;

@RestController
@RequestMapping("/Trades")
public class TradesController {

    TradesService TradesService;

    public TradesController(TradesService TradesService) {
        this.TradesService = TradesService;
    }

    @GetMapping("/{TradesID}")
    public ResponseEntity<String> getTradesDetails(@PathVariable Long TradesID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<Trades> getAllTradesDetails() {
        return TradesService.getAllTradess();
    }

    @PostMapping
    public ResponseEntity<String> createTradesDetails(@RequestBody Trades Trades){
        TradesService.createTrades(Trades);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateTradesDetails(@RequestBody Trades Trades){
        TradesService.updateTrades(Trades);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{TradesID}")
    public ResponseEntity<String> deleteTradesDetails(@PathVariable Long TradesID){
        TradesService.deleteTrades(TradesID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
