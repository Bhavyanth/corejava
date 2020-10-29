import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SharedserviceService {

  constructor() { }

  loginUser:any;

  isAdmin(){
    return this.loginUser!==undefined && this.loginUser.roles!==undefined && this.loginUser.roles.includes('ROLE_ADMIN');

  }


}
