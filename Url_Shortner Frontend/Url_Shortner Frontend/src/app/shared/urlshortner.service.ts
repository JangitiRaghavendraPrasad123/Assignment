import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class UrlshortnerService {

   serviceUrl : string = '';
   constructor(private http: HttpClient) { 
   this.serviceUrl="http://localhost:7070/3xerdsfs";
  }

  getShortUrl(url : string){
    //return this.http.post<any>(this.serviceUrl,url)
    return this.http.post<any>(this.serviceUrl,url);
  }
}
