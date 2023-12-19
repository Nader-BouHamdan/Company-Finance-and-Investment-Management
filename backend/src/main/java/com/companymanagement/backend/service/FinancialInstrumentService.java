package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.FinancialInstrument;

public interface FinancialInstrumentService {
    String createFinancialInstrument(FinancialInstrument FinancialInstrument);
    String updateFinancialInstrument(FinancialInstrument FinancialInstrument);
    String deleteFinancialInstrument(Long FinancialInstrumentId);
    FinancialInstrument getFinancialInstrument(Long FinancialInstrumentId);
    List<FinancialInstrument> getAllFinancialInstruments();
}

