import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { CompanyService } from '../services/company.service';

@Injectable({
  providedIn: 'root'
})

export class AuthGuard {
  constructor(private companyService: CompanyService, private router: Router){}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    if(this.companyService.isLoggedIn()){
      return true;
    }else{
      this.router.navigate(['/login']);
      return false;
    }

  }

}