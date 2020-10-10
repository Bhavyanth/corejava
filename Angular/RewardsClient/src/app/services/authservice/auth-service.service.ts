import { Injectable } from '@angular/core';
import {BaseserviceService} from '../baseservice/baseservice.service';
import { environment } from '../../../environments/environment';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private baseService : BaseserviceService) { }
  authSignUpServiceUrl = environment.authUrl + "api/auth/";
  authLoginServiceUrl =environment.authUrl;

  public getToken(): string {
    return "";
  }

  public signUp(registerModel:any){
    let headers = new HttpHeaders();
    headers = headers.append('noToken', 'noToken');
    return this.baseService.postMethodWithHeaders(this.authSignUpServiceUrl +"signup",registerModel,headers);
  }

  public signIn(registerModel:any){
    let headers = new HttpHeaders();
    headers = headers.append('noToken', 'noToken');
    return this.baseService.postMethodWithHeaders(this.authLoginServiceUrl +"login",registerModel,headers);
  }
  
}
