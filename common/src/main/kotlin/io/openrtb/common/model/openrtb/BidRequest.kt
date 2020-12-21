package io.openrtb.common.model.openrtb

data class BidRequest(
    var id: String,
    var imp: List<Impression>,
    var site: Site?,
    var app: App?,
    var device: Device?,
    var user: User?,
    var test: Int? = 0,
    var at: Int? = 2,
    var tmax: Int?,
    var wseat: List<String>?, // whitelist of buyer seats allowed to bid on this deal.
                              // Seat IDs must be communicated bidders and the exchange a priori.
                              // Omission implies no seat restrictions
    var allimps: Int? = 0,
    var cur: List<String>?, // currencies
    var bcat: List<String>?, // blocked advertiser categories
    var badv: List<String>?,
    var regs: Regs,
    var ext: List<String>? // placeholder for exchange-specific extensions to OpenRTB
)

data class Regs(
    var coppa: Int?, // Flag indicating if this request is subject to the COPPA regulations established by the USA FTC,
                     // where 0 = no, 1 = yes.
    var ext: String?
)
