package com.graps.m3daaty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_food)
    }
}