import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RiskMetric } from '../interfaces/risk';

@Injectable({
  providedIn: 'root'
})
export class RiskMetricService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/RiskMetric';

  constructor(private http: HttpClient) { }

  getRiskMetric(RiskMetricID: number): Observable<RiskMetric> {
    return this.http.get<RiskMetric>(`${this.baseUrl}/${RiskMetricID}`);
  }

  getAllRiskMetric(): Observable<RiskMetric[]> {
    return this.http.get<RiskMetric[]>(this.baseUrl);
  }

  createRiskMetric(RiskMetric: RiskMetric): Observable<string> {
    return this.http.post<string>(this.baseUrl, RiskMetric);
  }

  updateRiskMetric(RiskMetric: RiskMetric): Observable<string> {
    return this.http.put<string>(this.baseUrl, RiskMetric);
  }

  deleteRiskMetric(RiskMetricID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${RiskMetricID}`);
  }

}
