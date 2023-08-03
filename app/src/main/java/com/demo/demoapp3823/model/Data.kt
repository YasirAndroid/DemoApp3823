package com.demo.demoapp3823.model

data class Data(
    val category_id: Int,
    val name: String,
    val photo: String,
    val sub_category: List<SubCategory>
)