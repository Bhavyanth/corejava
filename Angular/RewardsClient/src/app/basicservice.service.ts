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
 headers.append('Authorization','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZGl0aHlhMiIsImlhdCI6MTU5Njk3NjE1OSwiZXhwIjoxNTk3MDYyNTU5fQ.T8KwGNwHGAN4UtX4_xW41VcWHRi5bwGMK9tgOh_BbVJrRylndTBjlnfGkgTTGqYFmn5SFeRHHr7QlnDjD6ePTg')
 let options = new RequestOptions({headers: headers});
    this.http.get('http://localhost:8083/api/test/admin', options).subscribe(data => {
   
})
  }

  
}
