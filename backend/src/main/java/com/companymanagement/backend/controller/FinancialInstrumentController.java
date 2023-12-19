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
import com.companymanagement.backend.model.FinancialInstrument;
import com.companymanagement.backend.service.FinancialInstrumentService;

@RestController
@RequestMapping("/FinancialInstrument")
public class FinancialInstrumentController {

    FinancialInstrumentService FinancialInstrumentService;

    public FinancialInstrumentController(FinancialInstrumentService FinancialInstrumentService) {
        this.FinancialInstrumentService = FinancialInstrumentService;
    }

    @GetMapping("/{FinancialInstrumentID}")
    public ResponseEntity<String> getFinancialInstrumentDetails(@PathVariable Long FinancialInstrumentID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<FinancialInstrument> getAllFinancialInstrumentDetails() {
        return FinancialInstrumentService.getAllFinancialInstruments();
    }

    @PostMapping
    public ResponseEntity<String> createFinancialInstrumentDetails(@RequestBody FinancialInstrument FinancialInstrument){
        FinancialInstrumentService.createFinancialInstrument(FinancialInstrument);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateFinancialInstrumentDetails(@RequestBody FinancialInstrument FinancialInstrument){
        FinancialInstrumentService.updateFinancialInstrument(FinancialInstrument);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{FinancialInstrumentID}")
    public ResponseEntity<String> deleteFinancialInstrumentDetails(@PathVariable Long FinancialInstrumentID){
        FinancialInstrumentService.deleteFinancialInstrument(FinancialInstrumentID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
