// risk-metric.component.ts

import { Component } from '@angular/core';
import { RiskMetric } from 'src/app/core/interfaces/risk';
import { RiskMetricService } from 'src/app/core/services/risk.service';

@Component({
  selector: 'app-risk-metric',
  templateUrl: './risk-metric.component.html',
  styleUrls: ['./risk-metric.component.css'],
})
export class RiskMetricComponent {
  riskMetrics!: RiskMetric[]
  data: any;

  constructor(private riskService: RiskMetricService){
    this.riskService.getAllRiskMetric().subscribe(
      response => {this.data = response; this.riskMetrics = this.data}
    );
  }
}
