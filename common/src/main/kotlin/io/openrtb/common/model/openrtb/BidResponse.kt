package io.openrtb.common.model.openrtb

data class BidResponse(
    var id: String,
    var seatbid: List<SeatBid>?,
    var bidid: String?,
    var cur: String? = "USD",
    var customdata: String?,
    var ext: String?
)

data class SeatBid(
    var bid: List<Bid>?,
    var seat: String?,
    var group: String?,
    var ext: String?
)

data class Bid(
    var id: String,
    var impid: String,
    var price: Float,
    var adid: String?,
    var nurl: String?,
    var adm: String?, // optional means of conveying ad markup in case the bid wins;
                      // supersedes the win notice if markup is included in both
    var adomain: List<String>?,
    var irul: String?,
    var cid: String?,
    var crid: String?,
    var attr: List<Int>,
    var ext: String
)
