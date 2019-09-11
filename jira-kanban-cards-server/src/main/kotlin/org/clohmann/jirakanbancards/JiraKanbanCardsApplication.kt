package org.clohmann.jirakanbancards

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JiraKanbanCardsApplication

fun main(args: Array<String>) {
  runApplication<JiraKanbanCardsApplication>(*args)
}
