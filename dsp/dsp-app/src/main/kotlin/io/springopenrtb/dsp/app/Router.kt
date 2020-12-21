package io.springopenrtb.dsp.app

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {
    @Bean
    fun mainRouter(apiHandler: APIHandler) = router {
        POST("/", apiHandler::dsp)
    }
}
/*
POST /dsp-web/openrtb?ssp_name=BigAdExchange

{
    "id": "ad1d762d6d9719b6b3c9e09f6433a76d9b593738",
    "imp": [
        {
            "id": "10212sdsa1",
            "banner": {
                "h": 25,
                "w": 30
            },
            "video": {
                "mimes": ["video/x-msxmv"],
                "linearity": 54,
                "minduration": 100,
                "maxduration": 500,
                "protocol": 200
            },
            "bidfloor": 10.085
        }
    ],
    "app": {
        "id": "appTest",
        "bundle": "com.mygame"
    },
    "wseat": ["012asfdfd25"]
}
 */
