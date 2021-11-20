package com.graps.m3daaty.ui.mealreslut

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.RandomRecipes
import com.graps.m3daaty.model.network.Api
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.Constants
import com.graps.m3daaty.util.State
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class MealResultViewModel : BaseViewModel() {

    val certainCuisineRecipe = MutableLiveData<String>()

    init {
        getRecipes()
    }

    private fun getRecipes(){
        Api.spoonApi.getRandomRecipes(
                null,
                10,
                //Constants.MoeKey
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                   //certainCuisineRecipe.postValue(it.recipes?.get(0)?.image!!)
                },
                {   e ->
                    Log.v("Error101" , "on Error")
                }
            )
    }
}