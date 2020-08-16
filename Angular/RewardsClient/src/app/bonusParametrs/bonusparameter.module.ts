import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BonusparametersviewComponent } from './bonusparametersview/bonusparametersview.component';
import {BonusparametersaddComponent} from './bonusparametersadd/bonusparametersadd.component';



@NgModule({
  declarations: [BonusparametersviewComponent,BonusparametersaddComponent],
  imports: [
    CommonModule
  ],
  exports:[
    BonusparametersaddComponent,
    BonusparametersviewComponent
  ]
})
export class BonusparameterModule { }
