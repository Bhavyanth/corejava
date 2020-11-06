import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BonusparametersviewComponent } from './bonusparametersview/bonusparametersview.component';
import {BonusparametersaddComponent} from './bonusparametersadd/bonusparametersadd.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [BonusparametersviewComponent,BonusparametersaddComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports:[
    BonusparametersaddComponent,
    BonusparametersviewComponent
  ]
})
export class BonusparameterModule { }
