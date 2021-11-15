package com.graps.m3daaty.model.network

import com.graps.m3daaty.model.domain.recipeInformation.RecipeInformation
import com.graps.m3daaty.model.domain.randomRecipesResponse.RandomRecipes
import com.graps.m3daaty.model.domain.recipeNutrition.RecipeNutrition
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.model.domain.tasteResponse.RecipeTaste
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SpoonApiRequestMethods {

    @GET("random")
    fun getRandomRecipes(
        @Query("tags") filterTag: String?,
        @Query("number") recipesCount: Int?
    ) : Single<Response<RandomRecipes>>

    @GET("complexSearch")
    fun getRecipeSearchResult(
        @Query("query") recipeName:String?,
        @Query("cuisine") cuisine:String?,
        @Query("number") recipesCount: Int?
    ) : Single<Response<RecipeSearch>>

    @GET("{id}/information")
    fun getRecipeInfo(
        @Path("id") recipeId:Int
    ) : Single<Response<RecipeInformation>>

    @GET("{id}/tasteWidget.json")
    fun getRecipeTaste(
        @Path("id") recipeId:Int
    ) : Single<Response<RecipeTaste>>

    @GET("{id}/nutritionWidget.json")
    fun getRecipeNutrition(
        @Path("id") recipeId:Int
    ) : Single<Response<RecipeNutrition>>

}