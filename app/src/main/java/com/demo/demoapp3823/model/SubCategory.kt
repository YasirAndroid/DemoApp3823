package com.demo.demoapp3823.model

data class SubCategory(
    val inner_category: List<InnerCategory>,
    val name: String,
    val photo: Any,
    val sub_category_id: Int
)