import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Company } from '../interfaces/company';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
  private baseUrl = 'http://localhost:3306/investment_management_system/company';

  constructor(private http: HttpClient) { }

  getCompany(companyID: number): Observable<Company> {
    return this.http.get<Company>(`${this.baseUrl}/${companyID}`);
  }

  getAllCompanies(): Observable<Company[]> {
    return this.http.get<Company[]>(this.baseUrl);
  }

  createCompany(company: Company): Observable<string> {
    return this.http.post<string>(this.baseUrl, company);
  }

  updateCompany(company: Company): Observable<string> {
    return this.http.put<string>(this.baseUrl, company);
  }

  deleteCompany(companyID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${companyID}`);
  }
  
  login(email: string, password: string): Observable<any> {
    const loginData = { email, password };
    return this.http.post<any>(`${this.baseUrl}/validateCredentials`, loginData);
  }
}
