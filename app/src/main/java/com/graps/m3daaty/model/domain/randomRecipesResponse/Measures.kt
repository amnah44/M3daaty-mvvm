package com.graps.m3daaty.model.domain.randomRecipesResponse


import com.google.gson.annotations.SerializedName

data class Measures(
    @SerializedName("metric")
    val metric: Metric? = null,
    @SerializedName("us")
    val us: Us? = null
)