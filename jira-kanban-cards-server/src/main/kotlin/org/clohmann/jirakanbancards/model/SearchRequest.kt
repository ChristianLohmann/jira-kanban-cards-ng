package org.clohmann.jirakanbancards.model

data class SearchRequest(
    val auth: String,
    val jql: String
)
