package io.springopenrtb.dsp.app

import io.openrtb.common.model.openrtb.BidRequest
import io.openrtb.common.model.openrtb.BidResponse
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class APIHandler {

    fun dsp(request: ServerRequest): Mono<ServerResponse> {
        return request.bodyToMono(BidRequest::class.java)
            .map { req -> BidResponse("id", null, null, null, null, null) }
            .flatMap { res -> ServerResponse.ok().body(fromValue(res)) }
    }
}
