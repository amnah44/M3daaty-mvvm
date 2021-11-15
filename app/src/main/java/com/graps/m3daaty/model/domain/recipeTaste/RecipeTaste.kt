package com.graps.m3daaty.model.domain.recipeTaste


import com.google.gson.annotations.SerializedName

data class RecipeTaste(
    @SerializedName("bitterness")
    val bitterness: Double? = null,
    @SerializedName("fattiness")
    val fattiness: Double? = null,
    @SerializedName("saltiness")
    val saltiness: Double? = null,
    @SerializedName("savoriness")
    val savoriness: Double? = null,
    @SerializedName("sourness")
    val sourness: Double? = null,
    @SerializedName("spiciness")
    val spiciness: Double? = null,
    @SerializedName("sweetness")
    val sweetness: Double? = null
)