// risk-metric.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-risk-metric',
  templateUrl: './risk-metric.component.html',
  styleUrls: ['./risk-metric.component.css'],
})
export class RiskMetricComponent {
  riskMetrics = [
    { calculationType: 'Type A', calculatedRisk: 500, riskType: 'High' },
    { calculationType: 'Type B', calculatedRisk: 200, riskType: 'Medium' },
    // Add more mock risk metrics as needed
  ];
}
