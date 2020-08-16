import { Component, OnInit } from '@angular/core';
import {LoginModel} from '../../models/login.model'
import { Router } from '@angular/router';
import { AuthServiceService } from 'src/app/services/authservice/auth-service.service';
import { NotificationService } from 'src/app/services/notifications/notifier.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router,private authService:AuthServiceService,private notificationService :NotificationService) { }

  userData :any;
  ngOnInit(): void {
  }

  loginModel = new LoginModel();

  

  signIn(){
    this.authService.signIn(this.loginModel).subscribe(
      data => {
        this.userData = data;
        this.router.navigate(['/BPAdd']);
      },
      err => {
        console.log(err);
        this.notificationService.showErrorMsg(err.error.message);
        console.log(err);
      }
    );
  }

  signUp(){
    this.router.navigate(['/Register']);
  }

}
