package com.akinayhan.week4homework.network

import com.akinayhan.week4homework.model.MarsModel
import retrofit2.Call
import retrofit2.http.GET

interface MarsApiService {
    @GET("realestate")
    fun getProperties(): Call<ArrayList<MarsModel>>
}