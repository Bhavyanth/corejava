import { Component, OnInit } from '@angular/core';
import {RegisterModel} from '../../models/register.model';
import { Router } from '@angular/router';
import {AuthServiceService} from '../../services/authservice/auth-service.service';
import {NotificationService} from '../../services/notifications/notifier.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private router: Router ,private authService:AuthServiceService,private notificationService :NotificationService) { }
  signUpResponse: any;

  ngOnInit(): void {
  }

  registerModel = new RegisterModel();

  signIn(){
    this.router.navigate(['/Login']);
  }

  signUp(){
    this.authService.signUp(this.registerModel).subscribe(
      data => {
        this.signUpResponse = data;
        this.notificationService.showSuccessMsg(this.signUpResponse.message); 
        this.router.navigate(['/Login']);
      },
      err => {
        console.log(err);
        this.notificationService.showErrorMsg(err.error.message);
        console.log(err);
      }
    );
  }
}
