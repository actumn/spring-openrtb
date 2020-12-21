package io.openrtb.common.model.openrtb

data class App (
    var id: String?,
    var name: String?,
    var bundle: String?,
    var domain: String?,
    var storeurl: String?,
    var cat: List<String>?,
    var sectioncat: List<String>?,
    var pagecat: List<String>?,
    var ver: String?,
    var privacypolicy: Int?,
    var paid: Int?,
    var publisher: Publisher?,
    var content: Content?,
    var keywords: String?,
    var ext: String?
)
