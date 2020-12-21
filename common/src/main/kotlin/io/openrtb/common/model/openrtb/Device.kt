package io.openrtb.common.model.openrtb

data class Device(
    var ua: String?, // user agent string
    var geo: Geo?,
    var dnt: Int?,
    var lmt: Int?,  // Limit ad tracking signal , 0 = unrestricted, 1 = limited per commercial guidelines
    var ip: String?, // ipv4 address
    var ipv6: String?, // ipv6
    var devicetype: Int?, // general type of device
    var make: String?, // device make "Apple"
    var model: String?, // device model "iPhone"
    var os: String?, // device os "iOS"
    var osv: String?, // device os version "3.1.2"
    var hwv: String?, // hardware version of device "SS" for iPhone SS
    var h: Int?,
    var w: Int?,
    var ppi: Int?, // screen size as pixels per linear inch
    var pxratio: Float?, // ratio of physical pixels to device independent pixels
    var js: Int?, // Support for Javascript, 0 = no, 1 = yes
    var flashver: String?, // Version of Flash supported by the browser
    var laungae: String?, // Browser language
    var carrier: String?, // carrier or ISP "VERIZON", "WIFI". video friendly vs cellular
    var connectiontype: Int?, // Network connection type
    var ifa: String?, // ID sanctioned for advertiser use in the clear (i.e., not hashed)
    var didsha1: String?, // Hardware device ID, ex) IMEI, hashed via SHA1
    var didmd5: String?, // Hardware device ID. ex) IMEI, hashed via md5
    var dpidsha1: String?, // Platform device ID, ex) Android Id, Hashed via SHA1
    var dpidmd5: String?, // Platform device ID, ex) Android id, Hashed via md5
    var macsha1: String?, // MAC address
    var macmd5: String?, // MAC address
    var ext: String?
)

