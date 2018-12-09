import { Injectable } from '@angular/core';
import { SERVER_API_URL } from 'app/app.constants';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class HomeService {
    
public checkAuthenticityUrl = SERVER_API_URL + '/authentic-check/';

 constructor(private httpClient: HttpClient) {

 }
 checkAuthenticity(secretKey: Number): Observable<any> {
    return this.httpClient.get<Number>(this.checkAuthenticityUrl,{ observe: 'response' });
 }
}
