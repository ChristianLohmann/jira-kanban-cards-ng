import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Ticket} from '../model/ticket';
import {SearchRequest} from '../model/search-request';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private searchUrl: string;

  constructor(private http: HttpClient) {
    this.searchUrl = 'http://localhost:8080/search';
  }

  public findByJql(searchRequest: SearchRequest): Observable<Ticket[]> {
    return this.http.post<Ticket[]>(this.searchUrl, searchRequest);
  }

}
