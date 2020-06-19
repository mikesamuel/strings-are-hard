package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class FooTest {
    @Test
    fun constStrWithOrphanedSurrogates() {
        for (i in str.indices) {
            assertEquals(str[i], chars[i], "$i")
        }
    }
}
