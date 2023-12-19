// order.component.ts

import { Component, OnInit } from '@angular/core';
// import { OrderService } from './order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css'],
})
export class OrderComponent{
  // orders: Order[] = [];
  // newOrder: Order = { id: 0, symbol: '', side: 'buy', quantity: 0, price: 0, orderType: 'market' };

  // constructor(private orderService: OrderService) {}

  // ngOnInit() {
  //   this.loadOrders();
  // }

  // loadOrders() {
  //   this.orderService.getOrders().subscribe((data) => {
  //     this.orders = data;
  //   });
  // }

  // submitOrder() {
  //   this.orderService.placeOrder(this.newOrder).subscribe((order) => {
  //     console.log('Order placed:', order);
  //     this.loadOrders();
  //   });
  // }
}
