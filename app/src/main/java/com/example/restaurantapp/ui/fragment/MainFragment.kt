package com.example.restaurantapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restaurantapp.R
import com.example.restaurantapp.data.entity.Foods
import com.example.restaurantapp.databinding.FragmentMainBinding
import com.example.restaurantapp.ui.adapter.FoodAdapter
import com.example.restaurantapp.ui.viewmodel.MainFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        viewModel.foodList.observe(viewLifecycleOwner){
            val foodAdapter = FoodAdapter(requireContext(),it)
            binding.rvFoodList.adapter = foodAdapter
        }

        binding.rvFoodList.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: MainFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.tumYemekleriGetir()
    }
}