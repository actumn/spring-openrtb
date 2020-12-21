package io.openrtb.common.model.openrtb

data class Content(
    var id: String?,
    var episode: Int?,
    var title: String?,
    var series: String?,
    var season: String?,
    var producer: Producer?,
    var url: String?,
    var cat: List<String>?,
    var videoquality: Int?,
    var context: String?,
    var contentrating: String?, // content rating. "MPAA"
    var userrating: String?, // number of stars, likes, ...
    var qagmediarating: Int?, // Media rating per QAG guide line
    var keywords: String?, // comma separated
    var livestream: Int?,
    var sourcerelationship: Int?,
    var len: Int?,
    var language: String?,
    var embeddable: Int?,
    var ext: String?
)
