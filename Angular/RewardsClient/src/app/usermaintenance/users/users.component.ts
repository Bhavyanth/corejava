import { Component, OnInit } from '@angular/core';
import {SharedserviceService} from '../../services/sharedservice/sharedservice.service';
import {UsermaintenanceService} from '../../services/usermaintenance/usermaintenance.service';
import {ErrorServiceService} from '../../services/errorservice/error-service.service';
import { Router, NavigationExtras } from '@angular/router';


@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
users : any;
  constructor(private router: Router,private sharedserviceService: SharedserviceService ,private usermaintenanceService : UsermaintenanceService,
    private errorServiceService : ErrorServiceService) { }

  ngOnInit(): void {

    this.usermaintenanceService.getUsers().subscribe(
      data => {
          this.users =data;
      },
      err => {
       this.errorServiceService.handleError(err);
      }
    )

  }
  updateRoles(user:any){
    let navigationExtras: NavigationExtras = {
      queryParams: {
        userName: user.username,
      }
    };
    this.router.navigate(['/UserMaintenance/RolesUpdate'],navigationExtras);
  }

}
