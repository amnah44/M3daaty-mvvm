package com.graps.m3daaty.model.domain.recipeNutrition


import com.google.gson.annotations.SerializedName

data class RecipeNutrition(
    @SerializedName("bad")
    val bad: List<Bad>? = null,
    @SerializedName("calories")
    val calories: String? = null,
    @SerializedName("carbs")
    val carbs: String? = null,
    @SerializedName("expires")
    val expires: Long? = null,
    @SerializedName("fat")
    val fat: String? = null,
    @SerializedName("good")
    val good: List<Good>? = null,
    @SerializedName("isStale")
    val isStale: Boolean? = null,
    @SerializedName("protein")
    val protein: String? = null
)