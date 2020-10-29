import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';


  const TOKEN_KEY = 'auth-token';
  const USER_KEY = 'auth-user';
@Injectable({
  providedIn: 'root'
})
export class TokenStorageServiceService {
  jwtHelper = new JwtHelperService();

  
  constructor() { }

  signOut() {
    window.sessionStorage.clear();
  }

  public saveToken(token: string) {
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token);
  }

  public getToken(): string {
    return sessionStorage.getItem(TOKEN_KEY);
  }

  public saveUser(user) {
    window.sessionStorage.removeItem(USER_KEY);
    window.sessionStorage.setItem(USER_KEY, JSON.stringify(user));
  }

  public getUser() {
    return JSON.parse(sessionStorage.getItem(USER_KEY));
  }

  public isAuthenticated(): boolean {
    const token = sessionStorage.getItem(TOKEN_KEY);
    // Check whether the token is expired and return
    // true or false
    return !this.jwtHelper.isTokenExpired(token);
  }
}

//https://bezkoder.com/angular-jwt-authentication/