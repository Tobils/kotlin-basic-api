package com.example.ypp

import com.example.ypp.response.GetResponseRandomRestaurant
import retrofit2.http.GET

interface RandomAPI {
    @GET(value = "restaurant/random_restaurant")
    suspend fun getRestaurant(): GetResponseRandomRestaurant
}