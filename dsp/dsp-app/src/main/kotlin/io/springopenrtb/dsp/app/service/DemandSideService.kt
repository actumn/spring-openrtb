package io.springopenrtb.dsp.app.service

import io.openrtb.common.model.openrtb.BidRequest
import io.openrtb.common.model.openrtb.BidResponse
import org.springframework.stereotype.Service

@Service
class DemandSideService {

    fun respond(sspName: String?, request: BidRequest): BidResponse {
        return BidResponse("id", null, null, null, null, null)
    }
}
