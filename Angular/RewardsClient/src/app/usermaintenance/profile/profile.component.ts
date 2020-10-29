import { Component, OnInit } from '@angular/core';
import {UsermaintenancebaseComponent}  from '../usermaintenancebase/usermaintenancebase/usermaintenancebase.component';
import {SharedserviceService} from 'src/app/services/sharedservice/sharedservice.service';



@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent extends UsermaintenancebaseComponent implements OnInit {

  constructor( sharedserviceService : SharedserviceService) {
    super(sharedserviceService);
  }

  
  ngOnInit(): void {
    super.ngOnInit();
  
  }

}
