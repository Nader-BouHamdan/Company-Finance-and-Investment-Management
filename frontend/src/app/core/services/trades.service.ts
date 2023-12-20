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
    return this.http.get<Trades[]>(`${this.baseUrl}/trades`);
  }

  createTrades(Trades: Trades): Observable<any> {
    console.log(Trades)
    const headers = { 'Content-Type': 'application/json' };
    return this.http.post<string>(`${this.baseUrl}/create`, JSON.stringify(Trades), { headers , responseType: 'text' as 'json'});
  }

  updateTrades(Trades: Trades): Observable<string> {
    const headers = { 'Content-Type': 'application/json' };
    return this.http.put<string>(`${this.baseUrl}/update`, JSON.stringify(Trades), { headers , responseType: 'text' as 'json'});
  }

  deleteTrades(TradesID: number): Observable<string> {
    const headers = { 'Content-Type': 'application/json' };
    const options = { headers, responseType: 'text' as 'json' };
    return this.http.delete<string>(`${this.baseUrl}/${TradesID}`, { headers , responseType: 'text' as 'json'});
    
  }

}
