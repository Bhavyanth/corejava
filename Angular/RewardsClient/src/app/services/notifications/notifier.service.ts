import { Injectable } from '@angular/core';
import { NotifierService } from "angular-notifier";


@Injectable({
  providedIn: 'root'
})
export class NotificationService {

  constructor(private notifierService: NotifierService) { }

  showSuccessMsg(msg:string){
    this.notifierService.notify("success", msg);
  }
  showErrorMsg(msg:string){
    this.notifierService.notify("error", msg);
  }
}
