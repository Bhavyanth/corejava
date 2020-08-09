import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BasiccomponentComponent } from './basiccomponent/basiccomponent.component';
import { HttpModule } from '@angular/http';

@NgModule({
  declarations: [
    AppComponent,
    BasiccomponentComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
