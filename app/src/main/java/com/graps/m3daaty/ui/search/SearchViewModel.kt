package com.graps.m3daaty.ui.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.model.repository.Repository
import com.graps.m3daaty.ui.base.BaseViewModel
import com.graps.m3daaty.util.Constants
import com.graps.m3daaty.util.State
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class SearchViewModel : BaseViewModel(), SearchInteractionListener {
    private val _flag = MutableLiveData<Boolean>()
    private val _searchResult = MutableLiveData<State<RecipeSearch?>?>()

    val searchResult: LiveData<State<RecipeSearch?>?> = _searchResult
    val flag: LiveData<Boolean> = _flag

    init {
        _flag.postValue(true)
    }

    override fun onSearchItemClicked(result: Result) {
        TODO("Not yet implemented")
    }

    fun onSearchTextChanged(text: CharSequence?) {
        _flag.postValue(false)
        if (text.isNullOrEmpty()) {
            _flag.postValue(true)
            _searchResult.postValue(null)
        } else {
            observe(
                Repository.getRecipeSearchResult(text.toString()).delaySubscription(1000L,TimeUnit.MILLISECONDS),
                ::onSearchSuccess, ::onSearchError
            )
        }
    }

    private fun onSearchSuccess(result: State<RecipeSearch>) {
        _searchResult.postValue(result)
        Log.i("SEARCH_RESULT", searchResult.value?.toData()?.results.toString())
    }

    private fun onSearchError(throwable: Throwable) {

    }

}