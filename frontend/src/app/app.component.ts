import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public sidenavOpened: boolean = true;
  
  public toggleSidenav(): void {
    this.sidenavOpened = !this.sidenavOpened;
  }
}
