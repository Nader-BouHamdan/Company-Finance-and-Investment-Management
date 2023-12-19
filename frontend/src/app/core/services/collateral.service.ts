import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Collateral } from '../interfaces/collateral';

@Injectable({
  providedIn: 'root'
})
export class CollateralService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/Collateral';

  constructor(private http: HttpClient) { }

  getCollateral(CollateralID: number): Observable<Collateral> {
    return this.http.get<Collateral>(`${this.baseUrl}/${CollateralID}`);
  }

  getAllCollateral(): Observable<Collateral[]> {
    return this.http.get<Collateral[]>(this.baseUrl);
  }

  createCollateral(Collateral: Collateral): Observable<string> {
    return this.http.post<string>(this.baseUrl, Collateral);
  }

  updateCollateral(Collateral: Collateral): Observable<string> {
    return this.http.put<string>(this.baseUrl, Collateral);
  }

  deleteCollateral(CollateralID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${CollateralID}`);
  }

}
