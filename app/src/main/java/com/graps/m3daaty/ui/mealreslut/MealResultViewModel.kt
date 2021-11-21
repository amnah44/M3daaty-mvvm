package com.graps.m3daaty.ui.mealreslut

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.RandomRecipes
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.network.Api
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.*
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class MealResultViewModel : BaseViewModel(),IRecipeSearchListener {

    private val _certainCuisineRecipe = MutableLiveData<State<RecipeSearch>>()

    val certainCuisineRecipe: LiveData<State<RecipeSearch>>
        get() = _certainCuisineRecipe

    init {
        getRecipes()
    }

    private fun getRecipes(){
        _certainCuisineRecipe.postValue(State.Loading)
        observe(Repository.getRecipeSearchResult(
            null,
            Category.ITALIAN ),
            ::onSuccess ,
            ::onError
        )
    }

    private fun onSuccess(recipes : State<RecipeSearch>) =
        _certainCuisineRecipe.postValue(recipes)

    private fun onError(throwable: Throwable) = State.Error(throwable.message.toString())
}