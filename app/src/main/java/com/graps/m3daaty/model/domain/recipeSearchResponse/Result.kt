package com.graps.m3daaty.model.domain.recipeSearchResponse


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("imageType")
    val imageType: String? = null,
    @SerializedName("title")
    val title: String? = null
)