package com.graps.m3daaty.ui.mealreslut

import android.widget.BaseAdapter
import com.graps.m3daaty.R
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseInteractionListener

class MealResultAdapter(
    item: List<Result>, listener: IRecipeSearchListener)
    :com.graps.m3daaty.ui.base.BaseAdapter<Result>(item, listener) {
    override val layoutId: Int
        get() = R.layout.fragment_meal_result
}

interface IRecipeSearchListener : BaseInteractionListener{

}