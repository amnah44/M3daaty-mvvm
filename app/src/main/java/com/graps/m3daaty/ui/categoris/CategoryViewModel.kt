package com.graps.m3daaty.ui.categoris

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.repository.Repository.getRecipeSearchResult
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.*
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class CategoryViewModel : BaseViewModel(),CategoryInteractionListener {

    private val _category = MutableLiveData<List<CuisineList>>()
    val category:LiveData<List<CuisineList>> get()= _category
    val cuisineList = CuisineList()


    init {
        cuisineCategory()
    }
    override fun onCategorySelected(cuisine: State<CuisineList>) {

    }

    private fun cuisineCategory(){
        _category.postValue(category.value)
    }

}