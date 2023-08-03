package com.demo.demoapp3823.retrofit

import com.demo.demoapp3823.Utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    private var retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit? {
        val client = OkHttpClient.Builder().build()
        retrofit = Retrofit
            .Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()

        return retrofit
    }

}