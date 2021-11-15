package com.graps.m3daaty.model.domain.randomRecipesResponse


import com.google.gson.annotations.SerializedName

data class RandomRecipes(
    @SerializedName("recipes")
    val recipes: List<Recipe>? = null
)