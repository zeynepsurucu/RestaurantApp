package com.example.restaurantapp.di

import com.example.restaurantapp.data.datasource.FoodsDatasource
import com.example.restaurantapp.data.repository.FoodsRepository
import com.example.restaurantapp.retrofit.ApiUtils
import com.example.restaurantapp.retrofit.FoodsDao
import com.example.restaurantapp.retrofit.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFoodsRepository(fds: FoodsDatasource) : FoodsRepository {
        return FoodsRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFoodsDatasource(fdao: FoodsDao) : FoodsDatasource {
        return FoodsDatasource(fdao)
    }

    @Provides
    @Singleton
    fun provideFoodsDao() : FoodsDao {
        return ApiUtils.getKisilerDao()
    }
}