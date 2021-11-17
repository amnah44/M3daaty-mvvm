package com.graps.m3daaty.ui.home

import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.randomRecipes.Recipe
import com.graps.m3daaty.ui.base.BaseAdapter
import com.graps.m3daaty.ui.base.BaseInteractionListener

class RandomRecipesAdapter(
    item: List<Recipe>,
    listener: IRandomInteractionListener
) : BaseAdapter<Recipe>(item, listener) {
    override val layoutId: Int = R.layout.item_today_recipes
}

interface IRandomInteractionListener: BaseInteractionListener