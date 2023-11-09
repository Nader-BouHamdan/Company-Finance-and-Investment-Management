import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FrontPageComponent } from './modules/front-page/front-page.component';
import { LogsComponent } from './modules/logs/logs.component';
import { PortfolioComponent } from './modules/portfolio/portfolio.component';
import { ProfileComponent } from './modules/profile/profile.component';
import { RestrictedComponent } from './modules/restricted/restricted.component';

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
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
