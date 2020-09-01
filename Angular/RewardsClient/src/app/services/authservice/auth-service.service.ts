import { Injectable } from '@angular/core';
import {BaseserviceService} from '../baseservice/baseservice.service';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private baseService : BaseserviceService) { }
  authserviceUrl = environment.url + "api/auth/";

  public getToken(): string {
    return "";
  }

  public signUp(registerModel:any){
    return this.baseService.postMethod(this.authserviceUrl +"signup",registerModel);
  }

  public signIn(registerModel:any){
    return this.baseService.postMethod(this.authserviceUrl +"signin",registerModel);
  }
  
}
