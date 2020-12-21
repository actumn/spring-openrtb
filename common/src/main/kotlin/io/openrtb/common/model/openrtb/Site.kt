package io.openrtb.common.model.openrtb

data class Site(
    var id: String?,
    var name: String?,
    var domain: String?,
    var cat: List<String>?,
    var sectioncat: List<String>?,
    var pagecat: List<String>?,
    var page: String?,
    var ref: String?,
    var search: String?,
    var mobile: Int?,
    var privacypolicy: Int?,
    var publisher: Publisher?,
    var content: Content?,
    var keywords: String?,
    var ext: String?
)


data class Producer(
    var id: String?,
    var name: String?,
    var cat: List<String>?,
    var domain: String?,
    var ext: String?
)
