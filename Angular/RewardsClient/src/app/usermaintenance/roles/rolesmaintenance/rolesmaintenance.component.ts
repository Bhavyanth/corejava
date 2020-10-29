import { Component, OnInit } from '@angular/core';
import {UsermaintenanceService} from '../../../services/usermaintenance/usermaintenance.service';
import { Router, ActivatedRoute } from '@angular/router';
import { ErrorServiceService } from 'src/app/services/errorservice/error-service.service';
import { NotificationService } from 'src/app/services/notifications/notifier.service';

@Component({
  selector: 'app-rolesmaintenance',
  templateUrl: './rolesmaintenance.component.html',
  styleUrls: ['./rolesmaintenance.component.css']
})
export class RolesmaintenanceComponent implements OnInit {

  constructor(private notificationService :NotificationService,private errorServiceService : ErrorServiceService , private route: ActivatedRoute,
    private usermaintenanceService : UsermaintenanceService) { }
  userName :any;
  userdetails :any;
  allRoles:any;
  addedRole :any;
  ngOnInit(): void {

    this.route.queryParams.subscribe(params => {
      this.userName = params["userName"]
    });

    this.usermaintenanceService.getUserDetails(this.userName).subscribe(
    data =>{
      console.log(data);
      this.userdetails =data;
    },
    err =>{
      this.errorServiceService.handleError(err);
    }
    )

    this.usermaintenanceService.getRoles().subscribe(
      data =>{
        console.log(data);
        this.allRoles =data;
      },
      err =>{
        this.errorServiceService.handleError(err);
      }
      )
  }

  addRole(){
    var isRoleAddded = false;
    console.log(this.addedRole);
    for (var val of this.userdetails.roles) {
     if(val.role == this.addedRole.role){
      isRoleAddded =true;
     }
    }

    if(isRoleAddded){
      return;
    }
    else{
      this.userdetails.roles.push(this.addedRole);
    }    
  }

  deleteRole(role:any){
    this.userdetails.roles
    this.userdetails.roles = this.userdetails.roles.filter(obj => obj !== role);

  }

  updateUser(){
    this.usermaintenanceService.updateUserRoles(this.userdetails).subscribe(
      data =>{
        this.notificationService.showSuccessMsg("User Updated");
      },
      err =>{
        this.errorServiceService.handleError(err);
      }
      )
  }



}
