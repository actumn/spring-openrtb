package io.openrtb.common.model

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserBlocklistRequest(
    var identification: Identification,
    var advertisers: List<Advertiser>
)

data class Identification(
    @JsonProperty
    var organization: String?,
    @JsonProperty
    var timestamp: Long?,
    @JsonProperty
    var token: String?
)

data class Advertiser(
    @JsonProperty("landingPageTLD")
    var landingPage: String?,
    @JsonProperty("name")
    var name: String?,
    @JsonProperty("sinceThisTimestamp")
    var timestamp: Long?,
    @JsonProperty("blocklist")
    var blocklist: List<Blocklist?>?
)

data class Blocklist(
    @JsonProperty("publiserID")
    var publisherId: String?,
    @JsonProperty
    var publisherName: String?,
    @JsonProperty("siteID")
    var siteId: String?,
    @JsonProperty
    var siteName: String?
)
