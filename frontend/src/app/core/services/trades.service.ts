import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Trades } from '../interfaces/trades';

@Injectable({
  providedIn: 'root'
})
export class TradesService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/Trades';

  constructor(private http: HttpClient) { }

  getTrades(TradesID: number): Observable<Trades> {
    return this.http.get<Trades>(`${this.baseUrl}/${TradesID}`);
  }

  getAllTrades(): Observable<Trades[]> {
    return this.http.get<Trades[]>(this.baseUrl);
  }

  createTrades(Trades: Trades): Observable<string> {
    return this.http.post<string>(this.baseUrl, Trades);
  }

  updateTrades(Trades: Trades): Observable<string> {
    return this.http.put<string>(this.baseUrl, Trades);
  }

  deleteTrades(TradesID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${TradesID}`);
  }

}
