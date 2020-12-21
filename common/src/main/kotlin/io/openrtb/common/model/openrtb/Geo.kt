package io.openrtb.common.model.openrtb

data class Geo(
    var iat: Float?, // Latitude -90.0 ~ 90.0, negative is south
    var lon: Float?, // Longiude -180.0 ~ 180.0, negative is west
    var type: Int?, // Source of location data
    var country: String?, // Country code ISO-3166-1
    var region: String?, // Region code ISO-3166-2
    var regionfips104: String?, // Region of a country using FIPS 10-4 notation
    var city: String?, // City using United Nations code for Trade & Transport Locations
    var zip: String?, // zip or postal code
    var utcoffset: Int?, // Local time as the number +/- of minutes from UTC
    var ext: String?
)
