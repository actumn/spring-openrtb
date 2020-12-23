package io.springopenrtb.dsp.app.model

import java.util.concurrent.ConcurrentMap

interface DspPropsDAO {
    fun exchanges(): ConcurrentMap<String, RTBExchange>
    fun advertisers(): ConcurrentMap<String, RTBAdvertiser>
}
