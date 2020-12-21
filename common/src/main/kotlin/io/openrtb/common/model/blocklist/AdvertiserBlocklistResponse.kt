package io.openrtb.common.model.blocklist

import com.fasterxml.jackson.annotation.JsonValue

data class AdvertiserBlocklistResponse(
    var identification: Identification,
    var status: Status,
    var advertisers: Collection<Advertiser>
)

data class Status(
    var rquestToken: String?,
    var code: StatusCode?,
    var message: String?
)

enum class StatusCode(val code: Int) {
    Success(0),
    AuthError(1),
    DuplicateTxnError(2),
    OtherError(3);

    @JsonValue
    fun toValue(): Int {
        return code
    }
}
