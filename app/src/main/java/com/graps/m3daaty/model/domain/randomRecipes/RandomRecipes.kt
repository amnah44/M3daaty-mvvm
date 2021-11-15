package com.graps.m3daaty.model.domain.randomRecipes


import com.google.gson.annotations.SerializedName

data class RandomRecipes(
    @SerializedName("recipes")
    val recipes: List<Recipe>? = null
)