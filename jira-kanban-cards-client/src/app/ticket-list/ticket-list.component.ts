import { Component, OnInit } from '@angular/core';
import {Ticket} from '../model/ticket';
import {TicketService} from '../service/ticket.service';
import {SearchRequest} from '../model/search-request';

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.scss']
})
export class TicketListComponent implements OnInit {

  tickets: Ticket[];

  constructor(private ticketService: TicketService) { }

  ngOnInit() {
    const searchRequest = new SearchRequest('auth', 'some jql');
    this.ticketService.findByJql(searchRequest).subscribe(data => {
      this.tickets = data;
    });
  }

}
