package org.clohmann.jirakanbancards.model

data class Fields(
    val issuetype: IssueType,
    val summary: String,
    val status: Status,
    val assignee: String?,
    val reporter: Reporter,
    val priority: Priority
)
