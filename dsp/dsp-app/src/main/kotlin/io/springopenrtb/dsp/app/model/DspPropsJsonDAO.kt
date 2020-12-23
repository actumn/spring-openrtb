package io.springopenrtb.dsp.app.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.springopenrtb.dsp.app.config.DspConfig
import org.springframework.stereotype.Component
import java.io.File
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

@Component
class DspPropsJsonDAO(dspConfig: DspConfig): DspPropsDAO {
    final val dblocation: String = dspConfig.dblocation ?: "dspConf.json"
    final val mapper = ObjectMapper().registerKotlinModule()
    final val exchanges: ConcurrentMap<String, RTBExchange> = ConcurrentHashMap()
    final val advertisers: ConcurrentMap<String, RTBAdvertiser> = ConcurrentHashMap()

    init {
        load()
    }

    private fun load() {
        val resource = this::class.java.classLoader.getResource(dblocation)
        val props = mapper.readValue(File(resource!!.file ?: dblocation), DspProps::class.java)

        for (ex in props.exchanges) {
            exchanges[ex.orgname] = ex
        }
        for (adv in props.advertisers) {
            advertisers[adv.landingPage] = adv
        }
    }

    override fun exchanges(): ConcurrentMap<String, RTBExchange> {
        return exchanges
    }

    override fun advertisers(): ConcurrentMap<String, RTBAdvertiser> {
        return advertisers
    }
}
