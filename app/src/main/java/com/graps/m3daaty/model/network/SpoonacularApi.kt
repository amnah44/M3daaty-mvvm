package com.graps.m3daaty.model.network

import com.graps.m3daaty.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object SpoonacularApi {

    val apiClient = OkHttpClient
        .Builder()
        .addInterceptor(SpooncularApiInterceptor()).build()

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.Base_URL)
        .client(apiClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val spoonApi = retrofit.create(SpoonApiRequestMethods::class.java)
}