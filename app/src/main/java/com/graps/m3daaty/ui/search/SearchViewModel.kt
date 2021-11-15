package com.graps.m3daaty.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.ui.base.BaseViewModel

class SearchViewModel : BaseViewModel(){
    private val _flag = MutableLiveData<Boolean>()
    val flag: LiveData<Boolean> get() = _flag


}