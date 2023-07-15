package com.panic.unittest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val stringUtil : StringUtil
) : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result : LiveData<String>
        get() = _result

    fun test(str1 : String, str2 : String){
        _result.value = stringUtil.joinToString(listOf(str1, str1))
    }
}