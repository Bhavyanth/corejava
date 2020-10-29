import { Injectable } from '@angular/core';
import { NotificationService } from '../notifications/notifier.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ErrorServiceService {

  constructor(private notificationService :NotificationService,private router: Router) { }

  handleError(err:any){
    console.log(err)
    if (err.status === 401 || err.status === 403) {
      this.router.navigateByUrl(`/Login`);
      this.notificationService.showErrorMsg("Access Denied");
    }else{
      this.notificationService.showErrorMsg(err.error.msg);
    }
  }

  
}
