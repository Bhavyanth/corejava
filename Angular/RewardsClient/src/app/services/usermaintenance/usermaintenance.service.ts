import { Injectable } from '@angular/core';
import { BaseserviceService } from '../baseservice/baseservice.service';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UsermaintenanceService {

  constructor(private baseService : BaseserviceService) { }

  userMaintenanceServiceUrl = environment.userMaintenanceUrl;

  public getUserDetails(userName:any){
    return this.baseService.getMethod(this.userMaintenanceServiceUrl +"User/"+userName);
  }

  public getUsers(){
    return this.baseService.getMethod(this.userMaintenanceServiceUrl +"Users");
  }

  public getRoles(){
    return this.baseService.getMethod(this.userMaintenanceServiceUrl +"Roles");
  }

  public updateUserRoles(user:any){
    return this.baseService.postMethod(this.userMaintenanceServiceUrl +"updateUserRoles" , user);
  }

}