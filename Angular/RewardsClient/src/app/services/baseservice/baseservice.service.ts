import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BaseserviceService {

  constructor(private http: HttpClient) { }

 postMethod(url:string ,body:any){
    return this.http.post(url, body);
 }

 postMethodWithHeaders(url:string ,body:any,headers:any){
  return this.http.post(url, body,{headers: headers});
  }

  
  
}
