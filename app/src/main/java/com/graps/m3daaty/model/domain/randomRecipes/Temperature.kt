package com.graps.m3daaty.model.domain.randomRecipes


import com.google.gson.annotations.SerializedName

data class Temperature(
    @SerializedName("number")
    val number: Double? = null,
    @SerializedName("unit")
    val unit: String? = null
)