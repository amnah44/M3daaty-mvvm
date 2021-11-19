package com.graps.m3daaty.ui.home

import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.randomRecipes.Recipe
import com.graps.m3daaty.ui.base.BaseAdapter
import com.graps.m3daaty.ui.base.BaseInteractionListener

class RecommendedRecipeAdapter(
    items: List<Recipe>,
    listener: RecommendedInteractionListener
): BaseAdapter<Recipe>(items, listener) {
    override val layoutId: Int = R.layout.item_recommended
}

interface RecommendedInteractionListener: BaseInteractionListener