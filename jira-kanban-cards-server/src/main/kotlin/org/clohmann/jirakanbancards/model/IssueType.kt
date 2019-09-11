package org.clohmann.jirakanbancards.model

data class IssueType(
    val id: String,
    val description: String,
    val iconUrl: String,
    val name: String,
    val subtask: Boolean
)