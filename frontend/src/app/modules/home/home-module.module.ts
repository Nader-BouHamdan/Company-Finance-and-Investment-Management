import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeModuleRoutingModule } from './home-module-routing.module';
import { FrontPageComponent } from './front-page/front-page.component';
import { LogsComponent } from './logs/logs.component';
import { ProfileComponent } from './profile/profile.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { SideBarContentComponent } from '../side-bar-content/side-bar-content.component';
import { HomeComponentComponent } from '../home-component/home-component.component';
import { MaterialModule } from '../../Material.module';


@NgModule({
  declarations: [
    HomeComponentComponent,
    FrontPageComponent,
    LogsComponent,
    ProfileComponent,
    PortfolioComponent,
    SideBarContentComponent,
  ],
  imports: [
    CommonModule,
    HomeModuleRoutingModule,
    MaterialModule
  ]
})
export class HomeModuleModule { }
