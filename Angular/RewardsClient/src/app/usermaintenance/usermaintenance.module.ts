import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {UsermaintenanceComponent} from './usermaintenance/usermaintenance.component';



@NgModule({
  declarations: [UsermaintenanceComponent],
  imports: [
    CommonModule
  ],
  exports:[
    UsermaintenanceComponent,
  ]
})
export class UsermaintenanceModule { }
