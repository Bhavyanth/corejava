import { Injectable } from '@angular/core';
import { BaseserviceService } from '../baseservice/baseservice.service';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ParameterService {

  parameterServiceUrl = environment.parameterServiceUrl;

  constructor(private baseService : BaseserviceService) { }

  public getParameters(){
    return this.baseService.getMethod(this.parameterServiceUrl +"getparams");
  }

  public updateParameters(parametrs:any){
    return this.baseService.postMethod(this.parameterServiceUrl +"addParams" , parametrs);
  }
}
