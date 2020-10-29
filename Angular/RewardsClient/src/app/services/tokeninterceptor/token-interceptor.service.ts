import { Injectable, Injector } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse
} from '@angular/common/http';
import { AuthServiceService } from '../authservice/auth-service.service';
import { Observable } from 'rxjs/Observable';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { NotificationService } from '../notifications/notifier.service';
import {TokenStorageServiceService} from '../TokenStorageService/token-storage-service.service';
@Injectable({   providedIn: 'root' })
export class TokenInterceptor implements HttpInterceptor {
  
  constructor( private tokenStorageServiceService:TokenStorageServiceService,   private inj: Injector ) {}
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    let headers = request.headers
    .set('Content-Type', 'application/json');
    
   if (headers.get('noToken') === 'noToken') {
     headers = headers.delete('Authorization').delete('noToken');
     request = request.clone({headers: headers});
   }else{
    request = request.clone({
      setHeaders: {
        Authorization: `Bearer `+this.tokenStorageServiceService.getToken()
      }
    });
   }
  
  

    return next.handle(request)//.pipe(catchError(x=> this.handleAuthError(x))); //here use an arrow function, otherwise you may get "Cannot read property 'navigate' of undefined" on angular 4.4.2/net core 2/webpack 2.70
  }

  private handleAuthError(err: HttpErrorResponse): Observable<any> {
    //handle your auth error or rethrow
    if (err.status === 401 || err.status === 403) {
        //navigate /delete cookies or whatever
       
        // if you've caught / handled the error, you don't want to rethrow it unless you also want downstream consumers to have to handle it as well.
        return of(err.message); // or EMPTY may be appropriate here
    }
    return throwError(err);
}
}