package com.example.restaurantapp.retrofit

import com.example.restaurantapp.data.entity.FoodsResponse
import retrofit2.http.GET

interface FoodsDao {
    //http://kasimadalan.pe.hu/ base url

    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun tumYemekleriGetir() : FoodsResponse
}