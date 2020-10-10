import { Injectable } from '@angular/core';
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
@Injectable()
export class TokenInterceptor implements HttpInterceptor {
  constructor(public auth: AuthServiceService,private router: Router,private notificationService :NotificationService) {}
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    
    let headers = request.headers
    .set('Content-Type', 'application/json');
  
   if (headers.get('noToken') === 'noToken') {
     headers = headers.delete('Authorization').delete('noToken');
   }else{
    request.headers
    .set("Authorization", 'Bearer ds');
   }
  
   const newReq = request.clone({headers: headers});

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