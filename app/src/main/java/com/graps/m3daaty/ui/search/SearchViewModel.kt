package com.graps.m3daaty.ui.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.randomRecipes.Recipe
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.Event
import com.graps.m3daaty.util.State
import java.util.concurrent.TimeUnit


class SearchViewModel : BaseViewModel(), SearchInteractionListener {
    private val _loadingFlag = MutableLiveData<Boolean>()
    private val _errorFlag = MutableLiveData<Boolean>()
    private val _searchResult = MutableLiveData<State<RecipeSearch?>?>()

    val searchResult: LiveData<State<RecipeSearch?>?> = _searchResult
    val loadingFlag: LiveData<Boolean> = _loadingFlag
    val errorFlag: LiveData<Boolean> = _errorFlag
    val results= MutableLiveData<Event<Result>>()

    init {
        _loadingFlag.postValue(true)
        _errorFlag.postValue(false)
    }

    override fun onSearchItemClicked(result: Result) {
        results.postValue(Event(result))
    }

    fun onSearchTextChanged(text: CharSequence?) {
        _loadingFlag.postValue(false)
        if (text.isNullOrEmpty()) {
            _loadingFlag.postValue(true)
            _searchResult.postValue(null)
        } else {
            _searchResult.postValue(State.Loading)
            observe(
                Repository.getRecipeSearchResult(text.toString(), null).delaySubscription(1000L, TimeUnit.MILLISECONDS),
                ::onSearchSuccess, ::onSearchError
            )
        }
    }

    private fun onSearchSuccess(result: State<RecipeSearch>) {
        _searchResult.postValue(State.Loading)
        _searchResult.postValue(result)
        if(_searchResult.value?.toData()?.results?.isEmpty()==true){
            _errorFlag.postValue(true)
            _loadingFlag.postValue(false)
        }

        else
        {
            _errorFlag.postValue(false)
            _loadingFlag.postValue(false)
        }

        Log.i("SEARCH_RESULT", searchResult.value?.toData()?.results.toString())
    }

    private fun onSearchError(throwable: Throwable) {
        _errorFlag.postValue(true)
        _searchResult.postValue(null)
    }

}