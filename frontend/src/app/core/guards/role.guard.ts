import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { UserService } from '../services/user.service';
import { CompanyService } from '../services/company.service';

@Injectable({
  providedIn: 'root',
})
export class RoleGuard {
  constructor(private userService: CompanyService, private route: Router) {}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ):
    | Observable<boolean | UrlTree>
    | Promise<boolean | UrlTree>
    | boolean
    | UrlTree {
    const allowedRoles = route.data['allowedRoles'];
    const userRole = this.userService.getRole();
    if (allowedRoles.includes(userRole)) {
      return true;
    } else {
      return this.route.parseUrl('/site/access-denied');
    }
  }
}
