import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Company } from '../interfaces/company';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/company';

  constructor(private http: HttpClient) { }

  getCompany(companyID: number): Observable<Company> {
    return this.http.get<Company>(`${this.baseUrl}/${companyID}`);
  }

  getAllCompanies(): Observable<Company[]> {
    return this.http.get<Company[]>(`${this.baseUrl}`);
  }

  createCompany(company: Company): Observable<any> {
    console.log('Data to send:', company);
    const headers = { 'Content-Type': 'application/json' };
    return this.http.post<string>(`${this.baseUrl}/create`, JSON.stringify(company), { headers , responseType: 'text' as 'json'});
  }

  updateCompany(company: Company): Observable<string> {
    const headers = { 'Content-Type': 'application/json' };
    return this.http.put<string>(`${this.baseUrl}/update`, JSON.stringify(company), { headers , responseType: 'text' as 'json'});
  }

  deleteCompany(companyID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${companyID}`);
  }

  isLoggedIn() {
    return localStorage.getItem('token') != null;
  }

  getToken() {
    return localStorage.getItem('token') != null
      ? localStorage.getItem('token')
      : '';
  }

}
