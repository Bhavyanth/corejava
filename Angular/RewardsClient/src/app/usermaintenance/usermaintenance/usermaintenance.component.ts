import { Component, OnInit } from '@angular/core';
import {SharedserviceService} from '../../services/sharedservice/sharedservice.service';

@Component({
  selector: 'app-usermaintenance',
  templateUrl: './usermaintenance.component.html',
  styleUrls: ['./usermaintenance.component.css']
})
export class UsermaintenanceComponent implements OnInit {

  constructor(private sharedserviceService: SharedserviceService) { }

  loggedinUser : any;
  isAdmin : any =false;
  ngOnInit(): void {
    this.loggedinUser =this.sharedserviceService.loginUser;
    this.isAdmin = this.sharedserviceService.isAdmin();
  }

}
