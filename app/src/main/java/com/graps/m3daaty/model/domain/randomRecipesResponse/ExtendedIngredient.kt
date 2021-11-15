package com.graps.m3daaty.model.domain.randomRecipesResponse


import com.google.gson.annotations.SerializedName

data class ExtendedIngredient(
    @SerializedName("aisle")
    val aisle: String? = null,
    @SerializedName("amount")
    val amount: Double? = null,
    @SerializedName("consistency")
    val consistency: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("measures")
    val measures: Measures? = null,
    @SerializedName("meta")
    val meta: List<String>? = null,
    @SerializedName("metaInformation")
    val metaInformation: List<String>? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("nameClean")
    val nameClean: String? = null,
    @SerializedName("original")
    val original: String? = null,
    @SerializedName("originalName")
    val originalName: String? = null,
    @SerializedName("originalString")
    val originalString: String? = null,
    @SerializedName("unit")
    val unit: String? = null
)