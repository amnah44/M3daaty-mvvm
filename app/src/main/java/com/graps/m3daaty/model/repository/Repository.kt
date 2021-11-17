package com.graps.m3daaty.model.repository

import com.graps.m3daaty.model.network.Api
import com.graps.m3daaty.util.Constants
import com.graps.m3daaty.util.State
import io.reactivex.rxjava3.core.Single
import retrofit2.Response

object Repository {
    fun getRandomRecipes(filterTag: String?, recipesCount: Int?) = wrapResponse(
        Api.spoonApi
            .getRandomRecipes(
                filterTag,
                recipesCount,
                Constants.AMNAH_API_KEY
            )
    )
    fun getRecipeSearchResult(recipeName: String?) =
        wrapResponse(
            Api.spoonApi
                .getRecipeSearchResult(
                    recipeName,
                    Constants.AMNAH_API_KEY
                )
        )
    fun getRecipeInfo(recipeId: Int) {
        wrapResponse(
            Api.spoonApi
                .getRecipeInfo(
                    recipeId,
                    Constants.AMNAH_API_KEY
                )
        )
    }
    fun getRecipeTaste(recipeId: Int) = wrapResponse(
        Api.spoonApi
            .getRecipeTaste(
                recipeId,
                Constants.AMNAH_API_KEY
            )
    )
    fun getRecipeNutrition(recipeId: Int) = wrapResponse(
        Api.spoonApi
            .getRecipeNutrition(
                recipeId,
                Constants.AMNAH_API_KEY
            )
    )

    private fun <T> wrapResponse(response: Single<Response<T>>): Single<State<T>> {
        return response.map {
            State.Success(it.body())
        }
    }
}
