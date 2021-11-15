package com.graps.m3daaty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_food)
    }

    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.parent_container)
        _binding.bottomNav.setupWithNavController(navController)
    }
}