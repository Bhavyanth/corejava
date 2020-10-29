import { Component, OnInit } from '@angular/core';
import {SharedserviceService} from 'src/app/services/sharedservice/sharedservice.service';


@Component({
  selector: 'app-usermaintenancebase',
  template: `
      <div>
          base works!!
      </div>
  `
})
export class UsermaintenancebaseComponent implements OnInit {
  loggedinUser :any;
  constructor(private sharedserviceService : SharedserviceService) { }

  ngOnInit(): void {
     this.loggedinUser = this.sharedserviceService.loginUser;
  }

}
