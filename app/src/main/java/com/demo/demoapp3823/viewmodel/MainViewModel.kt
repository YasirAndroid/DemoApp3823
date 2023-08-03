package com.demo.demoapp3823.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.demoapp3823.model.CategoryModel
import com.demo.demoapp3823.repo.mainRepo

class MainViewModel : ViewModel() {

    private var categoryDataPrivate = MutableLiveData<CategoryModel>()
    var categoryData = categoryDataPrivate
    var repo = mainRepo

    fun getCategoryData() {
        repo.getCategoryData().observeForever {
            categoryData.postValue(it)
        }
    }
}