package io.springopenrtb.ssp.app

import org.junit.jupiter.api.Test

class AppApplicationTests {

    @Test
    fun test() {
        val a = { s: String ->
            println(s)
            s
        }

        println(a("test"))
    }
}
