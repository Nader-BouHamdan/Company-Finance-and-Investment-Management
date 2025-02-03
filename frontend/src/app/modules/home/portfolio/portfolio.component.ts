// portfolio.component.ts

import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Company } from 'src/app/core/interfaces/company';
import { Trades } from 'src/app/core/interfaces/trades';
import { CompanyService } from 'src/app/core/services/company.service';
import { TradesService } from 'src/app/core/services/trades.service';

@Component({
  selector: 'app-portfolio',
  templateUrl: './portfolio.component.html',
  styleUrls: ['./portfolio.component.css']
})
export class PortfolioComponent {
  trades!: Trades[];

  token: any;
  company: any;
  data: any;

  tradesForm!: FormGroup

  companyBudget = 10000;
  riskTolerancePercentage = 50;

  newTrade: Trades ={
    tradeId: 0,
    timeStamp: new Date(),
    price: 0,
    quantity: 0,
    orderId: 0,
    portfolioId: 0,
  };

  constructor(private companyService: CompanyService, private tradesService: TradesService, private formBuilder: FormBuilder){
    this.token = this.companyService.getToken();
    this.companyService.getCompany(this.token).subscribe(
      response => {this.data = response; this.company = this.data; console.log(this.company)}
    );
    this.tradesService.getAllTrades().subscribe(
      response => {this.data = response; this.trades = this.data; console.log(this.trades)}
    );

      this.initForm();
  }

  initForm() {
    this.tradesForm = this.formBuilder.group({
      price: [''],
      quantity: [''],
      date: [''],
    });
  }

  onSubmit() {
    if (this.tradesForm.valid) {
      const price = this.tradesForm.get('price')!.value;
      const quantity = this.tradesForm.get('quantity')!.value;
      const date = this.tradesForm.get('date')!.value;

      const formData: Trades= {
        tradeId: 0,
        price: price,
        quantity: quantity,
        timeStamp: date,
        orderId: 1,
        portfolioId: 1
      }

      console.log(formData);
      this.tradesService.createTrades(formData).subscribe(
        response => {
          console.log('Trade added successfully', response);
        },
        error => {
          console.error('Error adding trade', error);
        }
      );
    }
  }


  calculateRisk(trade: any): number {
    return trade.quantity * trade.price;
  }

  calculateTotalRisk(): number {
    // return this.trades.reduce((totalRisk, trade) => totalRisk + this.calculateRisk(trade), 0);
    return 0;
  }

  calculateRiskThreshold(): number {
    return (this.riskTolerancePercentage / 100) * this.companyBudget;
  }

  isRiskExceeded(): boolean {
    return this.calculateTotalRisk() > this.calculateRiskThreshold();
  }

  addTrade(): void {
    this.tradesService.createTrades(this.newTrade).subscribe();
    this.resetNewTrade();
  }

  removeTrade(trade: any): void {
    console.log(trade.tradeID);
    this.tradesService.deleteTrades(trade.tradeID).subscribe();
  }

  resetNewTrade(): void {
    this.newTrade = {
      tradeId: 0,
      timeStamp: new Date(),
      price: 0,
      quantity: 0,
      orderId: 0,
      portfolioId: 0,
    };
  }
}
