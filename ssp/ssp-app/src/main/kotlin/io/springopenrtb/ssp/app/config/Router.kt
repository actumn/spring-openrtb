package io.springopenrtb.ssp.app.config

import io.springopenrtb.ssp.app.handler.APIHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {
    @Bean
    fun mainRouter(apiHandler: APIHandler) = router {
        POST("/", apiHandler::ssp)
    }
}
