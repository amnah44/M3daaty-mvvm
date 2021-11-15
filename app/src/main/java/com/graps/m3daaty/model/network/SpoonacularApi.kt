package com.graps.m3daaty.model.network

import com.graps.m3daaty.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object SpoonacularApi {

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.Base_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val spoonApi = retrofit.create(SpoonApiRequestMethods::class.java)
}