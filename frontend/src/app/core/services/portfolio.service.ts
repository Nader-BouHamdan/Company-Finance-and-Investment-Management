import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Portfolio } from '../interfaces/portfolio';

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/Portfolio';

  constructor(private http: HttpClient) { }

  getPortfolio(PortfolioID: number): Observable<Portfolio> {
    return this.http.get<Portfolio>(`${this.baseUrl}/${PortfolioID}`);
  }

  getAllPortfolio(): Observable<Portfolio[]> {
    return this.http.get<Portfolio[]>(this.baseUrl);
  }

  createPortfolio(Portfolio: Portfolio): Observable<string> {
    return this.http.post<string>(this.baseUrl, Portfolio);
  }

  updatePortfolio(Portfolio: Portfolio): Observable<string> {
    return this.http.put<string>(`${this.baseUrl}/update`, Portfolio);
  }

  deletePortfolio(PortfolioID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${PortfolioID}`);
  }

}
