import { Component, OnInit } from '@angular/core';
import {SharedserviceService} from '../../services/sharedservice/sharedservice.service';
import {UsermaintenancebaseComponent} from '../../usermaintenance/usermaintenancebase/usermaintenancebase/usermaintenancebase.component';
@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent extends UsermaintenancebaseComponent implements OnInit {

  constructor( sharedserviceService :SharedserviceService) {
    super(sharedserviceService);
   }

  ngOnInit(): void {
   super.ngOnInit();
  }

}
