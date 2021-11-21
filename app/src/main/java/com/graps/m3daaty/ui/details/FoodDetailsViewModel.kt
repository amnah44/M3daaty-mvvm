package com.graps.m3daaty.ui.details

import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.Recipe
import com.graps.m3daaty.model.domain.recipeInformation.RecipeInformation
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.State

class FoodDetailsViewModel : BaseViewModel() ,IngredientsAndDirectionInteractionListener{
    val details = MutableLiveData<State<RecipeInformation>>()

    fun getRecipesDetails(id: Int){
        details.postValue(State.Loading)
        observe(Repository.getRecipeInfo(id), ::onSuccess, ::onError)
    }

    private fun onSuccess(detail: State<RecipeInformation>) = details.postValue(detail)

    private fun onError(throwable: Throwable) = State.Error(throwable.message.toString())

    override fun onClickIngredient(ingredientsText: String) {
        TODO("Not yet implemented")
    }

    override fun onClickDirection(DirectionText: String) {
        TODO("Not yet implemented")
    }
}