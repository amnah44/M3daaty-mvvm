package com.graps.m3daaty.ui.search

import android.view.View
import android.view.ViewGroup

import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseAdapter

class SearchAdapter(val searchItems: List<Result>) : BaseAdapter<Result>(searchItems,) {
    override val layoutId: Int
        get() = TODO("Not yet implemented")
}