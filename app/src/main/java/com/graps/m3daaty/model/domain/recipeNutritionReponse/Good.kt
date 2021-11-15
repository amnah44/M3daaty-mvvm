package com.graps.m3daaty.model.domain.recipeNutritionReponse


import com.google.gson.annotations.SerializedName

data class Good(
    @SerializedName("amount")
    val amount: String? = null,
    @SerializedName("indented")
    val indented: Boolean? = null,
    @SerializedName("percentOfDailyNeeds")
    val percentOfDailyNeeds: Double? = null,
    @SerializedName("title")
    val title: String? = null
)