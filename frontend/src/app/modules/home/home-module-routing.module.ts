import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FrontPageComponent } from './front-page/front-page.component';
import { LogsComponent } from './logs/logs.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { ProfileComponent } from './profile/profile.component';
import { RestrictedComponent } from './restricted/restricted.component';
import { RiskMetricComponent } from './risk-metric/risk-metric.component';
import { TradesComponent } from './trades/trades.component';
import { OrderComponent } from './order/order.component';

const routes: Routes = [
  {
    path: 'main',
    component: FrontPageComponent
  },
  {
    path: 'logs',
    component: LogsComponent
  },
  {
    path: 'portfolio',
    component: PortfolioComponent
  },
  {
    path: 'profile',
    component: ProfileComponent
  },
  {
    path: 'riskMetric',
    component: RiskMetricComponent
  },
  {
    path: 'trades',
    component: TradesComponent
  },
  {
    path: 'order',
    component: OrderComponent
  },
  {
    path: '',
    redirectTo: 'main',
    pathMatch: 'full'
  },
  {
    path: '**',
    component: RestrictedComponent,
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeModuleRoutingModule { 
  
}
