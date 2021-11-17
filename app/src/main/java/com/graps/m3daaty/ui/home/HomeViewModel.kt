package com.graps.m3daaty.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.RandomRecipes
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.State

class HomeViewModel : BaseViewModel() {
    private val _recipeToday = MutableLiveData<State<RandomRecipes>>()
    val recipeToday: LiveData<State<RandomRecipes>>
        get() = _recipeToday

    init {
        getRandomRecipesToday()
    }

    private fun getRandomRecipesToday(){
        _recipeToday.postValue(State.Loading)
        observe(Repository.getRandomRecipes("vegetarian", 15), ::onSuccess, ::onError)
    }

    private fun onSuccess(recipe: State<RandomRecipes>) = _recipeToday.postValue(recipe)
    private fun onError(throwable: Throwable) = State.Error(throwable.message.toString())

}