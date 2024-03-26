package com.example.restaurantapp.data.datasource

import com.example.restaurantapp.data.entity.Foods
import com.example.restaurantapp.retrofit.FoodsDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodsDatasource (var fdao: FoodsDao) {

    suspend fun tumYemekleriGetir() : List<Foods> =
        withContext(Dispatchers.IO){
            return@withContext fdao.tumYemekleriGetir().foods
        }
}