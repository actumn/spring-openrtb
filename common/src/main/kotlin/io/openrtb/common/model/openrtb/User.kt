package io.openrtb.common.model.openrtb

data class User (
    var id: String?, // Exchange-specific ID for the user.
    var buyeruid: String?, // Buyer-specific ID for the user as mapped by the exchange for the buyer
    var yob: Int?, // Year of birth as a 4-digit integer
    var gender: String?, // Gender, "M" = male, "F" = female, "O" = known to be other
    var keywords: String?, // Comma separated list of keywords, interests, or intent
    var customdata: String?, // Optional feature to pass bidder data that was set in the exchange's cookie.
    var geo: Geo?,
    var data: List<Data>?,
    var ext: String?
)

data class Data(
    var id: String?,
    var name: String?,
    var segment: List<Segment>?,
    var ext: String?
)

data class Segment(
    var id: String?,
    var name: String?,
    var value: String?,
    var ext: String?
)
