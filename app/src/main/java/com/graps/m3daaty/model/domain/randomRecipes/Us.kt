package com.graps.m3daaty.model.domain.randomRecipes


import com.google.gson.annotations.SerializedName

data class Us(
    @SerializedName("amount")
    val amount: Double? = null,
    @SerializedName("unitLong")
    val unitLong: String? = null,
    @SerializedName("unitShort")
    val unitShort: String? = null
)