import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Instrument } from '../interfaces/instrument';

@Injectable({
  providedIn: 'root'
})
export class FinancialInstrumentService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/FinancialInstrument';

  constructor(private http: HttpClient) { }

  getFinancialInstrument(FinancialInstrumentID: number): Observable<Instrument> {
    return this.http.get<Instrument>(`${this.baseUrl}/${FinancialInstrumentID}`);
  }

  getAllFinancialInstrument(): Observable<Instrument[]> {
    return this.http.get<Instrument[]>(this.baseUrl);
  }

  createFinancialInstrument(FinancialInstrument: Instrument): Observable<string> {
    return this.http.post<string>(this.baseUrl, FinancialInstrument);
  }

  updateFinancialInstrument(FinancialInstrument: Instrument): Observable<string> {
    return this.http.put<string>(this.baseUrl, FinancialInstrument);
  }

  deleteFinancialInstrument(FinancialInstrumentID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${FinancialInstrumentID}`);
  }

}
