package com.graps.m3daaty.model.repository

import android.util.Log
import com.graps.m3daaty.model.domain.recipeSearchResponse.RecipeSearch
import com.graps.m3daaty.model.network.SpoonacularApi
import com.graps.m3daaty.util.State
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import retrofit2.Response

object Repository {

    fun getRandomRecipes(filterTag: String?, recipesCount: Int?) = wrapResponse(
        SpoonacularApi.spoonApi
            .getRandomRecipes(
                filterTag,
                recipesCount,
            )
    )

    fun getRecipeSearchResult(recipeName: String, cuisine: String?, recipesCount: Int?) =
        wrapResponse(
            SpoonacularApi.spoonApi
                .getRecipeSearchResult(
                    recipeName,
                    cuisine,
                    recipesCount,
                )
        )


    fun getRecipeInfo(recipeId: Int) {
        wrapResponse(
            SpoonacularApi.spoonApi
                .getRecipeInfo(
                    recipeId,
                )
        )
    }

    fun getRecipeTaste(recipeId: Int) = wrapResponse(
        SpoonacularApi.spoonApi
            .getRecipeTaste(
                recipeId,
            )
    )

    fun getRecipeNutrition(recipeId: Int) = wrapResponse(
        SpoonacularApi.spoonApi
            .getRecipeNutrition(
                recipeId
            )
    )


    private fun <T> wrapResponse(response: Single<Response<T>>): Single<State<T>> {
        return response.map {
            State.Success(it.body())
        }
    }
}
