package com.graps.m3daaty.ui.search

import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseInteractionListener

interface SearchInteractionListener : BaseInteractionListener {
    fun onSearchItemClicked(result: Result)
}