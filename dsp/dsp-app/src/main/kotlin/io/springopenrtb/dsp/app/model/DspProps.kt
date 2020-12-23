package io.springopenrtb.dsp.app.model

import com.fasterxml.jackson.annotation.JsonProperty

data class DspProps(
    @JsonProperty("exchanges")
    var exchanges: List<RTBExchange>,
    @JsonProperty("advertisers")
    var advertisers: List<RTBAdvertiser>
)

data class RTBExchange(
    @JsonProperty("orgname")
    var orgname: String?,
    @JsonProperty("rtbUrl")
    var rtbServiceUrl: String?,
    @JsonProperty("rtbCtype")
    var rtbContentType: String?
)

data class RTBAdvertiser(
    @JsonProperty("landingPage")
    var landingPage: String?,
    @JsonProperty("name")
    var name: String?,
    @JsonProperty("nurl")
    var nurl: String?,
    @JsonProperty("categories")
    var categories: List<String>?,
    @JsonProperty("seats")
    var seats: Map<String, String?>?
)
