package com.example.restaurantapp.retrofit
class ApiUtils {
    companion object{
        val BASE_URL = "http://kasimadalan.pe.hu"

        fun getKisilerDao() : FoodsDao {
            return RetrofitClient.getClient(BASE_URL).create(FoodsDao::class.java)
        }
    }
}