package io.springopenrtb.ssp.app

import io.openrtb.common.model.blocklist.AdvertiserBlocklistRequest
import io.openrtb.common.model.blocklist.AdvertiserBlocklistResponse
import io.openrtb.common.model.blocklist.Status
import io.openrtb.common.model.blocklist.StatusCode
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class APIHandler {
    val supplySideService = SupplySideService()

    fun ssp(request: ServerRequest): Mono<ServerResponse> {
        return request.bodyToMono(AdvertiserBlocklistRequest::class.java)
            .map { r ->
                val status = Status(r.identification.token, StatusCode.Success, "success")
                val advertisers = supplySideService.blocklist(
                    r.advertisers
                )

                // TODO:: verify token
                // TODO:: sign identification token

                AdvertiserBlocklistResponse(r.identification, status, advertisers)
            }
            .flatMap { r -> ServerResponse.ok()
                .body(fromValue(r)) }
    }
}
