package com.example.api_usage_demo

data class ProductData(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)