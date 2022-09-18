package com.akinayhan.week4homework.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MarsApi {

    private const val BASE_URL = "https://mars.udacity.com/"

    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}