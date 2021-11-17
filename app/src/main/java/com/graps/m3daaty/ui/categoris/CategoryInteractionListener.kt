package com.graps.m3daaty.ui.categoris

import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.ui.base.BaseInteractionListener
import com.graps.m3daaty.util.CuisineList
import com.graps.m3daaty.util.State

interface CategoryInteractionListener:BaseInteractionListener {
    fun onCategorySelected(cuisine: State<CuisineList>)
}