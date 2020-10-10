import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent }  from './auth/login/login.component';
import { RegisterComponent }  from './auth/register/register.component';
import {BonusparametersaddComponent} from './bonusParametrs/bonusparametersadd/bonusparametersadd.component';
import {BonusparametersviewComponent} from './bonusParametrs/bonusparametersview/bonusparametersview.component';
import {UsermaintenanceComponent} from './usermaintenance/usermaintenance/usermaintenance.component';


const routes: Routes = 
[
 {path:'Login',component:LoginComponent},
 { path: '', redirectTo: '/Login', pathMatch: 'full' },
 { path: 'Register',  component:RegisterComponent},
 { path: 'UserMaintenance',  component:UsermaintenanceComponent},
 { path: 'BPAdd',  component:BonusparametersaddComponent},
 { path: 'BPview',  component:BonusparametersviewComponent},
 
 
 ]

 
@NgModule({
  imports: [RouterModule.forRoot(routes,)],
  exports: [RouterModule]
})

export class AppRoutingModule { }