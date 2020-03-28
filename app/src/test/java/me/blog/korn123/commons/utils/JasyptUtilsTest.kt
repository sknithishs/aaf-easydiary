package me.blog.korn123.commons.utils

import org.junit.Assert.*
import org.junit.Test

class JasyptUtilsTest {

    @Test
    fun test_01() {
        val plainText = "apple and banana"
        val keyString = "test-password-string"
        val cipherText = JasyptUtils.encrypt(plainText, keyString)
        println(plainText)
        println(JasyptUtils.sha256(plainText))
        println(JasyptUtils.decrypt(cipherText, keyString))
        assertEquals(plainText, JasyptUtils.decrypt(cipherText, keyString))
    }
}