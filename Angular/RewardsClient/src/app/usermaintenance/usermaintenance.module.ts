import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {UsermaintenanceComponent} from './usermaintenance/usermaintenance.component';
import { ProfileComponent } from './profile/profile.component';
import { UsersComponent } from './users/users.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { RouterModule } from '@angular/router';
import { UsermaintenancebaseComponent } from './usermaintenancebase/usermaintenancebase/usermaintenancebase.component';
import { RolesmaintenanceComponent } from './roles/rolesmaintenance/rolesmaintenance.component';
import { FormsModule } from '@angular/forms';
import { NgxBootstrapIconsModule ,allIcons } from 'ngx-bootstrap-icons';




@NgModule({
  declarations: [UsermaintenanceComponent, ProfileComponent, UsersComponent, UserhomeComponent, UsermaintenancebaseComponent, RolesmaintenanceComponent],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    NgxBootstrapIconsModule.pick(allIcons)
  ],
  exports:[
    UsermaintenanceComponent,
  ]
})
export class UsermaintenanceModule { }
