package io.springopenrtb.dsp.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@SpringBootApplication
//@EnableConfigurationProperties(DspProperties::class)
@ConfigurationPropertiesScan("io.springopenrtb.dsp.app.config")
class AppApplication

fun main(args: Array<String>) {
    val app = SpringApplication(AppApplication::class.java)
    app.webApplicationType = WebApplicationType.REACTIVE
    app.run(*args)
}
