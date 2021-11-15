package com.graps.m3daaty.model.domain.recipeInformation


import com.google.gson.annotations.SerializedName

data class WinePairing(
    @SerializedName("pairedWines")
    val pairedWines: List<Any>? = null,
    @SerializedName("pairingText")
    val pairingText: String? = null,
    @SerializedName("productMatches")
    val productMatches: List<Any>? = null
)