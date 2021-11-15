package com.graps.m3daaty.model.domain.randomRecipes


import com.google.gson.annotations.SerializedName

data class AnalyzedInstruction(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("steps")
    val steps: List<Step>? = null
)