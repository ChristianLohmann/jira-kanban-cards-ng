package org.clohmann.jirakanbancards.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
class JiraConfig {
    @Bean
    @Qualifier("jira")
    fun jiraObjectMapper(objectMapperBuilder: Jackson2ObjectMapperBuilder): ObjectMapper {
        return objectMapperBuilder
            .createXmlMapper(false)
            .build<ObjectMapper>()
            .apply { propertyNamingStrategy = PropertyNamingStrategy.LOWER_CAMEL_CASE }
    }
}