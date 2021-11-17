package com.graps.m3daaty.ui.categoris

import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseAdapter
import com.graps.m3daaty.util.Category
import com.graps.m3daaty.util.CuisineList

class CategoryAdapter(list:List<CuisineList>,listener:CategoryInteractionListener?):BaseAdapter<CuisineList>(list,listener) {
    override val layoutId: Int
        get() = R.layout.item_cuisine
}