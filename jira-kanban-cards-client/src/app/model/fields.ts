class IssueType {
  id: string;
  description: string;
  iconUrl: string;
  name: string;
  subtask: boolean;
}

class Status {
  description: string;
  name: string;
}

class Priority {
  iconUrl: string;
  name: string;
}

class Reporter {
  name: string;
  displayName: string;
}

export class Fields {
  issuetype: IssueType;
  summary: string;
  status: Status;
  assignee: string;
  reporter: Reporter;
  priority: Priority;
  customfield_14537: number;
}
