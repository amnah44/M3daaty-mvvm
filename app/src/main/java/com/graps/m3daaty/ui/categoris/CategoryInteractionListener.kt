package com.graps.m3daaty.ui.categoris

import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.ui.base.BaseInteractionListener

interface CategoryInteractionListener:BaseInteractionListener {
    fun onCategorySelected(cuisine:RecipeSearch)
}