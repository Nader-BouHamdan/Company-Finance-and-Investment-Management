// portfolio.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-portfolio',
  templateUrl: './portfolio.component.html',
  styleUrls: ['./portfolio.component.css']
})
export class PortfolioComponent {
  trades = [
    { symbol: 'AAPL', quantity: 10, price: 150.25, date: new Date('2023-01-01') },
    { symbol: 'GOOGL', quantity: 5, price: 2500.75, date: new Date('2023-02-15') },
    // Add more mock trades as needed
  ];

  companyBudget = 10000;
  riskTolerancePercentage = 50;

  newTrade = {
    symbol: '',
    quantity: 0,
    price: 0,
    date: new Date()
  };

  calculateRisk(trade: any): number {
    return trade.quantity * trade.price;
  }

  calculateTotalRisk(): number {
    return this.trades.reduce((totalRisk, trade) => totalRisk + this.calculateRisk(trade), 0);
  }

  calculateRiskThreshold(): number {
    return (this.riskTolerancePercentage / 100) * this.companyBudget;
  }

  isRiskExceeded(): boolean {
    return this.calculateTotalRisk() > this.calculateRiskThreshold();
  }

  addTrade(): void {
    if (this.validateTrade()) {
      this.trades.push({ ...this.newTrade });
      this.resetNewTrade();
    }
  }

  removeTrade(trade: any): void {
    const index = this.trades.indexOf(trade);
    if (index !== -1) {
      this.trades.splice(index, 1);
    }
  }

  validateTrade(): boolean {
    const isValidSymbol = this.newTrade.symbol && this.newTrade.symbol.trim() !== '';
    const isValidQuantity = this.newTrade.quantity !== null && this.newTrade.quantity > 0;
    const isValidPrice = this.newTrade.price !== null && this.newTrade.price > 0;
    const isValidDate = this.newTrade.date !== null;

    return !!isValidSymbol && !!isValidQuantity && !!isValidPrice && !!isValidDate;;
  }

  resetNewTrade(): void {
    this.newTrade = {
      symbol: '',
      quantity: 0,
      price: 0,
      date: new Date()
    };
  }
}
