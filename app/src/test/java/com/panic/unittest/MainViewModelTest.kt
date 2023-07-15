package com.panic.unittest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class MainViewModelTest{
    lateinit var mainViewModel: MainViewModel
    lateinit var stringUtil: StringUtil

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp(){
        stringUtil = Mockito.mock(StringUtil::class.java)
        Mockito.`when`(stringUtil.joinToString(listOf("A", "B"))).thenReturn("AB")
        mainViewModel = MainViewModel(stringUtil)
    }

    @Test
    fun test(){
        mainViewModel.test("HELLO", "WORLD")
        val result = mainViewModel.result.value
        Truth.assertThat(result).isEqualTo("HELLOWORLD")
    }
}