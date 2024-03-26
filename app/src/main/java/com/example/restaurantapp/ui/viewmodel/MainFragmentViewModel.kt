package com.example.restaurantapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurantapp.data.entity.Foods
import com.example.restaurantapp.data.repository.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(var frepo: FoodsRepository) : ViewModel() {
    var foodList = MutableLiveData<List<Foods>>()

    init {
        tumYemekleriGetir()
    }


    fun  tumYemekleriGetir(){
        CoroutineScope(Dispatchers.Main).launch {
            foodList.value = frepo.tumYemekleriGetir()
        }
    }


}