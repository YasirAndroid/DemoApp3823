package com.demo.demoapp3823.repo

import androidx.lifecycle.MutableLiveData
import com.demo.demoapp3823.model.CategoryModel
import com.demo.demoapp3823.retrofit.APIClient
import com.demo.demoapp3823.retrofit.APIService
import okhttp3.Callback
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Response

object mainRepo {

    var service = APIClient.getRetrofit()!!.create(APIService::class.java)

    fun getCategoryData() : MutableLiveData<CategoryModel> {
        val result = MutableLiveData<CategoryModel>()
        val body = MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart("category_type", "1")
            .addFormDataPart("lang_id", "1")
            .build()

        val call = service.getCategoryData(body)
        call.enqueue(object : retrofit2.Callback<CategoryModel> {
            override fun onResponse(call: Call<CategoryModel>, response: Response<CategoryModel>) {
                if (response.isSuccessful) {
                    result.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {

            }

        })
        return result
    }

}