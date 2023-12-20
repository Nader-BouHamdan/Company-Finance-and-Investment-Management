import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FrontPageComponent } from './front-page/front-page.component';
import { LogsComponent } from './logs/logs.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { RestrictedComponent } from './restricted/restricted.component';
import { RiskMetricComponent } from './risk-metric/risk-metric.component';
import { TradesComponent } from './trades/trades.component';
import { OrderComponent } from './order/order.component';
import { EditUserComponent } from './edit-user/edit-user.component';

const routes: Routes = [
  {
    path: 'logs',
    component: LogsComponent
  },
  {
    path: 'portfolio',
    component: PortfolioComponent
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
    path: 'edit',
    component: EditUserComponent
  },
  {
    path: '',
    redirectTo: 'portfolio',
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
