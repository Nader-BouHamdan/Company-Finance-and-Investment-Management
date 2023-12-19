import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeModuleRoutingModule } from './home-module-routing.module';
import { FrontPageComponent } from './front-page/front-page.component';
import { LogsComponent } from './logs/logs.component';
import { ProfileComponent } from './profile/profile.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { SideBarContentComponent } from './side-bar-content/side-bar-content.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { MaterialModule } from '../../Material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RiskMetricComponent } from './risk-metric/risk-metric.component';
import { TradesComponent } from './trades/trades.component';
import { OrderComponent } from './order/order.component';


@NgModule({
  declarations: [
    HomeComponentComponent,
    FrontPageComponent,
    LogsComponent,
    ProfileComponent,
    PortfolioComponent,
    SideBarContentComponent,
    RiskMetricComponent,
    TradesComponent,
    OrderComponent,
  ],
  imports: [
    CommonModule,
    HomeModuleRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    MaterialModule
  ]
})
export class HomeModuleModule { }
