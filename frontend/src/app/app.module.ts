import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FrontPageComponent } from './modules/front-page/front-page.component';
import { LogsComponent } from './modules/logs/logs.component';
import { ProfileComponent } from './modules/profile/profile.component';
import { PortfolioComponent } from './modules/portfolio/portfolio.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    FrontPageComponent,
    LogsComponent,
    ProfileComponent,
    PortfolioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
