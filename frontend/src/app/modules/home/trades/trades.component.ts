import { Component } from '@angular/core';
import { TradesService } from 'src/app/core/services/trades.service';
@Component({
  selector: 'app-trades',
  templateUrl: './trades.component.html',
  styleUrls: ['./trades.component.css']
})
export class TradesComponent {

  trades!: any[];

  constructor(private tradesService: TradesService){
    this.getTrades();
  }

  public getTrades(){
    this.tradesService.getAllTrades().subscribe(
      response => {
        this.trades = response;
      }
    )
  }

  }
