import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Stocks } from '../interfaces/stocks';

@Injectable({
  providedIn: 'root'
})
export class StocksService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/Stocks';

  constructor(private http: HttpClient) { }

  getStocks(FinancialStocksID: number): Observable<Stocks> {
    return this.http.get<Stocks>(`${this.baseUrl}/${FinancialStocksID}`);
  }

  getAllStocks(): Observable<Stocks[]> {
    return this.http.get<Stocks[]>(this.baseUrl);
  }

  createStocks(FinancialStocks: Stocks): Observable<string> {
    return this.http.post<string>(this.baseUrl, FinancialStocks);
  }

  updateStocks(FinancialStocks: Stocks): Observable<string> {
    return this.http.put<string>(`${this.baseUrl}/update`, FinancialStocks);
  }

  deleteStocks(FinancialStocksID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${FinancialStocksID}`);
  }

}
