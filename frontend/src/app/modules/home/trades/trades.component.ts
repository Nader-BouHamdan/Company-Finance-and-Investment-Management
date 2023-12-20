import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms'; // Import necessary form-related modules
import { Trades } from 'src/app/core/interfaces/trades';
import { TradesService } from 'src/app/core/services/trades.service';

@Component({
  selector: 'app-trades',
  templateUrl: './trades.component.html',
  styleUrls: ['./trades.component.css']
})
export class TradesComponent implements OnInit {
  trades!: Trades[];
  data!: any;
  tradesForm!: FormGroup;

  constructor(private tradesService: TradesService, private fb: FormBuilder) {}

  ngOnInit() {
    this.getTrades();
  }


  public getTrades(){
    this.tradesService.getAllTrades().subscribe(
      response => {
        this.data = response;
        this.trades = this.data;
        console.log(this.trades)
      }, error => {console.log(error)}
    )
  }
}
