package io.openrtb.common.model.openrtb

data class Impression(
    var id: String,
    var banner: Banner?,
    var vide: Video?,
    var native: Native?,
    var displaymanager: String?,
    var displaymanagerver: String?,
    var instl: Int? = 0, // 1 = the ad is interstitial or full screen, 0 = not interstitial
    var tagid: String?,
    var bidfloor: Float? = 0.0f,
    var bidfloorcur: String? = "USD",
    var secure: Int?,
    var iframebuster: List<String>?,
    var pmp: Pmp?,
    var ext: String?
)


data class Banner(
    var w: Int?,
    var h: Int?,
    var wmax: Int?,
    var hmax: Int?,
    var wmin: Int?,
    var hmin: Int?,
    var id: String?,
    var pos: Int?,
    var btype: List<Int>?,
    var battr: List<Int>?,
    var mimes: List<String>?, // content MIME types supported. "application/x-shockwave-flash"
    var topframe: Int?,
    var expdir: List<Int>?,
    var api: List<Int>?,
    var ext: String?
)

data class Video(
    var mimes: List<String>, //video/x-ms-xmv
    var minduration: Int?,
    var maxduration: Int?,
    var protocol: Int?, // Deprecated
    var protocols: List<Int>?,
    var w: Int?,
    var h: Int?,
    var startdelay: Int?,
    var linearity: Int?,
    var sequence: Int?,
    var battr: List<Int>?,
    var maxextended: Int?,
    var minbitrate: Int?,
    var maxbitrate: Int?,
    var boxingallowed: Int? = 1,
    var playbackmethod: List<Int>?,
    var delivery: List<Int>?,
    var pos: Int?,
    var companioned: List<Banner>?,
    var api: List<Int>?,
    var companiontype: List<Int>?,
    var ext: String?
)

data class Native(
    var request: String,
    var ver: String?,
    var api: List<Int>?,
    var battr: List<Int>?,
    var ext: String?
)

data class Pmp(
    var private_auction: Int?,
    var deals: List<Deal>?,
    var ext: String?
)

data class Deal(
    var id: String, // unique identifier for the direct deal
    var bidfloor: Float? = 0.0f,
    var bidfloorcur: String? = "USD",
    var at: Int?, // Optional override of the overall auction type of the bid request, where 1 = First price,
                  // 2 = Second Price plus, 3 = the value passed in bidfloor
    var wseat: List<String>?, // whitelist of buyer seats allowed to bid on this deal.
                              // Seat IDs must be communicated bidders and the exchange a priori.
                              // Omission implies no seat restrictions
    var wadomain: List<String>?, // Array of advertiser domains allowed to bid on this deal.
    var ext: String?
)
