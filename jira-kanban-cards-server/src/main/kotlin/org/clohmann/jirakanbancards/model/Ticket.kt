package org.clohmann.jirakanbancards.model

data class Ticket(
    val id: Long,
val key: String,
val self: String,
val expand: String,
val fields: Fields
) {

}