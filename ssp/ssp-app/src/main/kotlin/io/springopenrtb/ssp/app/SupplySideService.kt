package io.springopenrtb.ssp.app

import io.openrtb.common.model.Advertiser
import io.openrtb.common.model.Blocklist

class SupplySideService {
    val blocklistDB = mapOf<String, List<Blocklist>>(
        "acmeluxuryfurniture.com" to listOf(
            Blocklist("3422", "Joe's News", null, null),
            Blocklist("2342", "Big Portal", "1", "Finance section"),
            Blocklist("23423", "Smith Blog", "223", "Technology Section"),
            Blocklist("423", "Smith Blog", "23", "Cars Section"),
            Blocklist("34223", "Jones Blog", null, null)

        ),
        "luxurycarbrand.com" to listOf(
            Blocklist("34223", "Joe's Blog", null, null)
        )
    )
    val secret = "RTB"
    val org = "The SSP"


    fun blocklist(advertisers: Collection<Advertiser>): Collection<Advertiser> {
        for (a in advertisers) {
            val url = a.landingPage
            a.blocklist = blocklistDB[url]
        }
        return advertisers
    }
}
