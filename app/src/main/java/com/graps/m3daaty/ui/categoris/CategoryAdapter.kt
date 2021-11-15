package com.graps.m3daaty.ui.categoris

import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseAdapter
import com.graps.m3daaty.util.Category

class CategoryAdapter(list:List<Category>,listener:CategoryInteractionListener):BaseAdapter<Category>(list,listener) {
    override val layoutId: Int
        get() = R.layout.item_cuisine
}