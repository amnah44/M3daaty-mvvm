package com.graps.m3daaty.ui.details

import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.RandomRecipes
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.State
import io.reactivex.rxjava3.core.Single

class FoodDetailsViewModel : BaseViewModel() ,IngredientsAndDirectionInteractionListener{




    override fun onClickIngredient(ingredientsText: String) {
        TODO("Not yet implemented")
    }

    override fun onClickDirection(DirectionText: String) {
        TODO("Not yet implemented")
    }
}