package com.graps.m3daaty.model.network

import com.graps.m3daaty.util.Constants
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okhttp3.OkHttpClient


object Client {


    val apiClient = OkHttpClient.Builder()
        .addInterceptor(Interceptor { chain ->
            val original = chain.request()

            val originalHttpUrl = original.url
                .newBuilder()
                .addQueryParameter("apiKey", Constants.RAFAL_API_KEY)
                .build()

            val request = original.newBuilder().url(originalHttpUrl).build()

            chain.proceed(request)
        })
}


