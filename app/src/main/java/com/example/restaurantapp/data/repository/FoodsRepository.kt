package com.example.restaurantapp.data.repository

import com.example.restaurantapp.data.datasource.FoodsDatasource
import com.example.restaurantapp.data.entity.Foods

class FoodsRepository(var fds: FoodsDatasource) {

    suspend fun tumYemekleriGetir() : List<Foods> = fds.tumYemekleriGetir()

}