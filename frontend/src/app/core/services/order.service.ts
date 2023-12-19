import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Order } from '../interfaces/order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  
  private baseUrl = 'http://localhost:8080/investment_management_system/Order';

  constructor(private http: HttpClient) { }

  getOrder(OrderID: number): Observable<Order> {
    return this.http.get<Order>(`${this.baseUrl}/${OrderID}`);
  }

  getAllOrder(): Observable<Order[]> {
    return this.http.get<Order[]>(this.baseUrl);
  }

  createOrder(Order: Order): Observable<string> {
    return this.http.post<string>(this.baseUrl, Order);
  }

  updateOrder(Order: Order): Observable<string> {
    return this.http.put<string>(this.baseUrl, Order);
  }

  deleteOrder(OrderID: number): Observable<string> {
    return this.http.delete<string>(`${this.baseUrl}/${OrderID}`);
  }

}
