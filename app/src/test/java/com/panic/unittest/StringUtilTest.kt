package com.panic.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class StringUtilTest {

    private lateinit var stringUtil: StringUtil
    private lateinit var resultStr : String

    //Before: 테스트 함수가 실행되기 전에 실행되는 함수
    @Before
    fun setUp() {
        stringUtil = StringUtil()
    }

    //After: 테스트 함수가 완료되면 실행되는 함수
    @After
    fun result() {
        println("complete")
    }

    @Test
    fun joinToString() {
        resultStr = stringUtil.joinToString(listOf("A", "B", "C", "D"))
        //assertThat: 내가 테스트하려는 값 / isEqualTo 예상되는 결과 값
        assertThat(resultStr).isEqualTo("ABCD")
    }
}