package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.FinancialInstrument;
import com.companymanagement.backend.repository.FinancialInstrumentRepository;
import com.companymanagement.backend.service.FinancialInstrumentService;

@Service
public class FinancialInstrumentServiceImplement implements FinancialInstrumentService {

    @Autowired
    private FinancialInstrumentRepository FinancialInstrumentRepository;

    @Override
    public String createFinancialInstrument(FinancialInstrument FinancialInstrument) {
        FinancialInstrumentRepository.save(FinancialInstrument);
        return "Successfully created";
    }

    @Override
    public String deleteFinancialInstrument(Long FinancialInstrumentId) {
        FinancialInstrumentRepository.deleteById(FinancialInstrumentId);
        return "Successfully deleted";
    }

    @Override
    public List<FinancialInstrument> getAllFinancialInstruments() {
        return (List<FinancialInstrument>) FinancialInstrumentRepository.findAll();
    }

    @Override
    public FinancialInstrument getFinancialInstrument(Long FinancialInstrumentId) {
        return FinancialInstrumentRepository.findById(FinancialInstrumentId).get();
    }

    @Override
    public String updateFinancialInstrument(FinancialInstrument FinancialInstrument) {
        FinancialInstrumentRepository.save(FinancialInstrument);
        return "Successfully updated";
    }
}
