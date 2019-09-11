export class SearchRequest {

  auth: string;
  jql: string;

  constructor(auth: string, jql: string) {
    this.auth = auth;
    this.jql = jql;
  }
}
