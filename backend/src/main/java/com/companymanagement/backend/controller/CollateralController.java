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
import com.companymanagement.backend.model.Collateral;
import com.companymanagement.backend.service.CollateralService;

@RestController
@RequestMapping("/Collateral")
public class CollateralController {

    CollateralService CollateralService;

    public CollateralController(CollateralService CollateralService) {
        this.CollateralService = CollateralService;
    }

    @GetMapping("/{CollateralID}")
    public ResponseEntity<String> getCollateralDetails(@PathVariable Long CollateralID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<Collateral> getAllCollateralDetails() {
        return CollateralService.getAllCollaterals();
    }

    @PostMapping
    public ResponseEntity<String> createCollateralDetails(@RequestBody Collateral Collateral){
        CollateralService.createCollateral(Collateral);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateCollateralDetails(@RequestBody Collateral Collateral){
        CollateralService.updateCollateral(Collateral);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{CollateralID}")
    public ResponseEntity<String> deleteCollateralDetails(@PathVariable Long CollateralID){
        CollateralService.deleteCollateral(CollateralID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
