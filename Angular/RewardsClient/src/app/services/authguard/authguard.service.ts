import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import {TokenStorageServiceService} from '../TokenStorageService/token-storage-service.service';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService implements CanActivate {

  constructor(private auth : TokenStorageServiceService ,private router: Router) { }

  canActivate(): boolean {
    if (!this.auth.isAuthenticated()) {
      this.router.navigate(['Login']);
      return false;
    }
    return true;
  }
}
