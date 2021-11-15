package com.graps.m3daaty.model.domain.recipeSearchResponse


import com.google.gson.annotations.SerializedName

data class RecipeSearch(
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("offset")
    val offset: Int? = null,
    @SerializedName("results")
    val results: List<Result>? = null,
    @SerializedName("totalResults")
    val totalResults: Int? = null
)