package io.springopenrtb.dsp.app.handler

import io.openrtb.common.model.openrtb.BidRequest
import io.springopenrtb.dsp.app.service.DemandSideService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.queryParamOrNull
import reactor.core.publisher.Mono

@Component
class APIHandler(
    val demandSideService: DemandSideService
) {
    fun dsp(request: ServerRequest): Mono<ServerResponse> {
        val sspName = request.queryParamOrNull("ssp_name")
        return request.bodyToMono(BidRequest::class.java)
            .map { req -> demandSideService.respond(sspName, req) }
            .flatMap { res -> ServerResponse.ok().body(fromValue(res)) }
    }
}
