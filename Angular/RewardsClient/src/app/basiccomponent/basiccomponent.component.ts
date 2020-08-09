import { Component, OnInit } from '@angular/core';
import {BasicserviceService} from '../basicservice.service'

@Component({
  selector: 'app-basiccomponent',
  templateUrl: './basiccomponent.component.html',
  styleUrls: ['./basiccomponent.component.css']
})
export class BasiccomponentComponent implements OnInit {

  constructor(private  service:BasicserviceService) { }

  ngOnInit(): void {
  }

  save() {
    this.service.access();
  }

}
