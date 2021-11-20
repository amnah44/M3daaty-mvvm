package com.graps.m3daaty.model.network

import com.graps.m3daaty.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Api {

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.Base_URL)
        .client(Client.apiClient.build())
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())

        .build()

    val spoonApi = retrofit.create(SpoonApiService::class.java)
}