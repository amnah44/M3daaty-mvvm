package com.graps.m3daaty.model.domain.randomRecipesResponse


import com.google.gson.annotations.SerializedName

data class Length(
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("unit")
    val unit: String? = null
)