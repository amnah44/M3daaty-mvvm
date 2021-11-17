package com.graps.m3daaty.ui.search

import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseAdapter

class SearchAdapter(searchItems: List<Result>, listener: SearchInteractionListener) :
    BaseAdapter<Result>(searchItems, listener) {
    override val layoutId: Int = R.layout.item_search
}