package io.springopenrtb.dsp.app.service

import io.openrtb.common.model.openrtb.Bid
import io.openrtb.common.model.openrtb.BidRequest
import io.openrtb.common.model.openrtb.BidResponse
import io.openrtb.common.model.openrtb.SeatBid
import io.springopenrtb.dsp.app.model.DspPropsDAO
import org.springframework.stereotype.Service

@Service
class DemandSideService(val dspPropsDAO: DspPropsDAO) {
    var lastBidNum = 0.toLong()

    fun respond(sspName: String?, request: BidRequest): BidResponse {
        // TODO:: validate request

        val seatBids = mutableListOf<SeatBid>()


        val exchange = this.dspPropsDAO.exchanges()[sspName]?.copy()
        val advertisers = HashMap(this.dspPropsDAO.advertisers())
        val seats = mutableMapOf<String, String?>()

        for ((key, v) in advertisers.entries) {

            if (request.badv?.contains(key) == true) {
                continue // this advertiser is blocked for this request
            }

            if (v.categories?.let { request.bcat?.intersect(it)?.isNotEmpty() } == true) {
                continue
            }

            seats[v.seats?.get(sspName) ?: ""] = v.landingPage
        }

        for (imp in request.imp) {
            for ((key, v) in seats) {
                val adv = advertisers[v]
                val bid = Bid(
                    id = "SimpleBid#${lastBidNum++}",
                    impid = imp.id,
                    price = imp.bidfloor?.plus(0.10f) ?: 0.10f,
                    nurl = adv?.nurl,
                    adid = "AD123456789",
                    adm = null,
                    adomain = null,
                    irul = null,
                    cid = null,
                    crid = null,
                    attr = null,
                    ext = null
                )

                seatBids.add(SeatBid(
                    seat = key,
                    bid = mutableListOf(bid),
                    group = null,
                    ext = null
                ))
            }
        }


        return BidResponse(
            id = request.id,
            seatbid = seatBids,
            bidid = "simple-bid-tracker",
            customdata = null,
            ext = null)
    }
}
