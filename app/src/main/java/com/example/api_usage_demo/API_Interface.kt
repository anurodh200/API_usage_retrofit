package com.example.api_usage_demo

import retrofit2.Call
import retrofit2.http.GET

interface API_Interface {

    @GET("/products")
    fun getProductData(): Call<ProductData>


}