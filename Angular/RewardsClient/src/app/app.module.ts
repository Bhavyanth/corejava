import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BasiccomponentComponent } from './basiccomponent/basiccomponent.component';
import { HttpModule } from '@angular/http';

import {AppRoutingModule}  from './app-routing.module';
import {AuthenticationModule} from './auth/authentication.module';
import {TokenInterceptor} from '../app/services/tokeninterceptor/token-interceptor.service';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { NotifierModule } from "angular-notifier";
import { Router } from '@angular/router';
import {BonusparameterModule} from '../app/bonusParametrs/bonusparameter.module';
import {UsermaintenanceModule} from '../app/usermaintenance/usermaintenance.module';
import {TokenStorageServiceService} from './services/TokenStorageService/token-storage-service.service';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    BasiccomponentComponent,
  ],
  imports: [
    BrowserModule,
    HttpModule,
    AppRoutingModule,
    AuthenticationModule,
    HttpClientModule,
    BonusparameterModule,
    UsermaintenanceModule,
    FormsModule,
    NotifierModule.withConfig({
      // Custom options in here
      position: {
        horizontal: {
          /**
           * Defines the horizontal position on the screen
           * @type {'left' | 'middle' | 'right'}
           */
          position: 'right',
        },
        vertical: {
          /**
           * Defines the vertical position on the screen
           * @type {'top' | 'bottom'}
           */
          position: 'top',
        }
      }
  }),
  ],
  exports: [
   
  ],
  providers: [
    {
     provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi: true, //The multi: true option provided tells Angular that you are providing multiple interceptors 
    deps: [TokenStorageServiceService] //The deps property is an array of provider tokens. The Logger and UserService classes serve as tokens for their own class providers. The injector resolves these tokens and injects the corresponding services into the matching factory function parameters.
  }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
