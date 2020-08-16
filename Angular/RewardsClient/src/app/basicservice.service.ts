import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, URLSearchParams, ResponseContentType } from "@angular/http";

@Injectable({
  providedIn: 'root'
})
export class BasicserviceService {

  constructor(private http: Http) { }

  PostMethod( ) {

    
    this.http.post('http://localhost:8083/api/auth/signup', {
      "username": "adithya2",
      "role" :["mod"],
      "email" : "adithya.varkuri2@gmail.com",
      "password":"adithya"

    }).subscribe(data => {
   
})
  }

  PostsigninMethod( ) {

    
    this.http.post('http://localhost:8083/api/auth/signin', {
      "username": "adithya2",
      "password":"adithya"

    }).subscribe(data => {
   
})
  }

  access( ) {

    let headers = new Headers({'Content-Type': 'application/json'});  
 headers.append('Authorization','Bearer eyJhbGciOiJIUzUxMiJ9.eyJklzdWIiOiJhZGl0aHlhMiIsImlhdCI6MTU5NzI1MjIxOCwiZXhwIjoxNTk3MzM4NjE4fQ.eNlyLh_F3uAm1vCLnhPEuyol6sQJc5QZZNfduJYGmXonz6sPTYcrgUqnhMQeT6ZdAaKfmsmM3iKACOJSHB2DkA')
 let options = new RequestOptions({headers: headers});
    this.http.get('http://localhost:8083/api/test/all', options).subscribe(data => {
   
})
  }

  
}
