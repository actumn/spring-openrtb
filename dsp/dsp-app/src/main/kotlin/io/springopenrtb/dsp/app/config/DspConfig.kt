package io.springopenrtb.dsp.app.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding


@ConstructorBinding
@ConfigurationProperties(prefix = "dsp")
data class DspConfig (
    var dblocation: String?
)
