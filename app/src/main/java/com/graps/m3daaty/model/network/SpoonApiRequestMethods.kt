package com.graps.m3daaty.model.network

import com.graps.m3daaty.model.domain.getRecipeInformationResponse.RecipeInformation
import com.graps.m3daaty.model.domain.randomRecipesResponse.RandomRecipes
import com.graps.m3daaty.model.domain.recipeSearchResponse.RecipeSearch
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SpoonApiRequestMethods {

    @GET("random")
    fun getRandomRecipes(
        @Query("tags") filterTag: String?,
        @Query("number") recipesCount: Int?
    ) : Single<RandomRecipes>

    @GET("complexSearch")
    fun getRecipeSearchResult(
        @Query("query") recipeName:String?,
        @Query("cuisine") cuisine:String?,
        @Query("number") recipesCount: Int?
    ) : Single<RecipeSearch>

    @GET("{id}/information")
    fun getRecipeInfo(
        @Path("id") recipeId:Int
    ) : Single<RecipeInformation>



}