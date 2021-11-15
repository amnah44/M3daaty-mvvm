package com.graps.m3daaty.model.network

import com.graps.m3daaty.model.domain.randomRecipesResponse.RandomRecipes
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SpoonApiRequestMethods {

    @GET("recipes/random")
    fun getRandomRecipes(
        @Query("tags") filterTag: String?,
        @Query("number") recipesCount: Int
    ) : Single<RandomRecipes>



}