import { Component, OnInit } from '@angular/core';
import {ParameterService} from '../../services/parameterservice/parameter.service';
import {ErrorServiceService} from '../../services/errorservice/error-service.service';

@Component({
  selector: 'app-bonusparametersadd',
  templateUrl: './bonusparametersadd.component.html',
  styleUrls: ['./bonusparametersadd.component.css']
})
export class BonusparametersaddComponent implements OnInit {

  constructor(private parameterService :ParameterService , private errorServiceService: ErrorServiceService) { }
parameters:any;
addedParameter:any;
addedParameters:any =[];
  ngOnInit(): void {
    this.parameterService.getParameters().subscribe(
      data=>{
        this.parameters = data;
      },
      err =>{
        this.errorServiceService.handleError(err);
      }
    )

  }



  addParameter(){
    var isParameterAdded = false;
   
    for (var val of this.parameters) {
     if(val.paramName == this.addedParameter){
      isParameterAdded =true;
      break;
     }
    }
    if(this.addedParameters.includes(this.addedParameter)){
      isParameterAdded =true;
    }
    if(isParameterAdded){
      return;
    }
    else{
     this.addedParameters.push(this.addedParameter);
    }    
  }

  deleteParameter(role:any){
    
  }

  updateParameters(){
    this.parameterService.updateParameters(this.addedParameters).subscribe(
      data=>{
        this.parameters = data;
      },
      err =>{
        this.errorServiceService.handleError(err);
      }
    )

  }

}
