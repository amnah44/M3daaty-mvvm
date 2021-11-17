package com.graps.m3daaty.model.network

import com.graps.m3daaty.util.Constants
import okhttp3.Interceptor
import okhttp3.Response

class SpooncularApiInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("apiKey", Constants.apiKey)
            .build()
        return chain.proceed(request)
    }
}