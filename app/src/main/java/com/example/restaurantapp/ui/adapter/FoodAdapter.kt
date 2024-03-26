package com.example.restaurantapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.data.entity.Foods
import com.example.restaurantapp.databinding.FoodCardBinding
import com.google.android.material.snackbar.Snackbar

class FoodAdapter (var mContext: Context,
                   var foodList:List<Foods>,
                   //var viewModel:AnasayfaViewModel
                  )
    : RecyclerView.Adapter<FoodAdapter.FoodCardViewHolder>() {
    inner class FoodCardViewHolder(var view:FoodCardBinding) : RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodCardViewHolder {
        val binding = FoodCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodCardViewHolder, position: Int) {//0,1,2
        val food = foodList.get(position)
        val design = holder.view

       // design.imageViewFood.setImageResource(
           // mContext.resources.getIdentifier(
        //        food.yemek_resim_adi,
          //      "drawable",
         //       mContext.packageName
         //   )
       // )

        design.tvFoodName.text = food.yemek_adi
        design.tvFoodPrice.text = food.yemek_fiyat.toString()

    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}