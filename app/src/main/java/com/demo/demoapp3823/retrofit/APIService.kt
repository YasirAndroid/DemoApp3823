package com.demo.demoapp3823.retrofit

import com.demo.demoapp3823.model.CategoryModel
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {

    @POST("/api/get-category")
    fun getCategoryData(@Body body: RequestBody) : Call<CategoryModel>

}