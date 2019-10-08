package org.clohmann.jirakanbancards.controller

import org.clohmann.jirakanbancards.model.Fields
import org.clohmann.jirakanbancards.model.IssueType
import org.clohmann.jirakanbancards.model.Priority
import org.clohmann.jirakanbancards.model.Reporter
import org.clohmann.jirakanbancards.model.SearchRequest
import org.clohmann.jirakanbancards.model.Status
import org.clohmann.jirakanbancards.model.Ticket
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.zalando.riptide.Http

@RestController
@CrossOrigin(origins = ["http://localhost:4200"])
class TicketsController(
    @Qualifier("jira") private val http: Http
) {

    @PostMapping("/search")
    fun getTicketsByJql(@RequestBody searchRequest: SearchRequest): List<Ticket> {
        return mutableListOf<Ticket>(
            Ticket(
                id = 100000001,
                key = "BOOM-1",
                self = "https://url-to-jira.com/rest/api/latest/issue/100000001",
                expand = "operations,versionedRepresentations,editmeta,changelog,renderedFields",
                fields = Fields(
                    issuetype = IssueType(
                        id = "1",
                        description = "A task that needs to be done.",
                        iconUrl = "https://url-to-jira.com/secure/viewavatar?size=xsmall&avatarId=15778&avatarType=issuetype",
                        name = "Task",
                        subtask = false
                    ),
                    summary = "Do that thing!",
                    status = Status(
                        description = "Specification in progress",
                        name = "Initial"
                    ),
                    priority = Priority(
                        iconUrl = "https://url-to-jira.com/images/icons/priorities/major.svg",
                        name = "Major"
                    ),
                    reporter = Reporter(
                        name = "dhoppenstedt",
                        displayName = "Dickie Hoppenstedt"
                    ),
                    assignee = null,
                    customfield_14537 = 8.0
                )
            ),
            Ticket(
                id = 100000002,
                key = "BOOM-2",
                self = "https://url-to-jira.com/rest/api/latest/issue/100000002",
                expand = "operations,versionedRepresentations,editmeta,changelog,renderedFields",
                fields = Fields(
                    issuetype = IssueType(
                        id = "1",
                        description = "A bug that needs to be fixed.",
                        iconUrl = "https://url-to-jira.com/secure/viewavatar?size=xsmall&avatarId=15458&avatarType=issuetype",
                        name = "Bug",
                        subtask = false
                    ),
                    summary = "Fix that thing!",
                    status = Status(
                        description = "Work in progress",
                        name = "In Progress"
                    ),
                    priority = Priority(
                        iconUrl = "https://url-to-jira.com/images/icons/priorities/major.svg",
                        name = "Major"
                    ),
                    reporter = Reporter(
                        name = "ohoppenstedt",
                        displayName = "Opa Hoppenstedt"
                    ),
                    assignee = null,
                    customfield_14537 = 3.0
                )
            )
        )

    }


}
