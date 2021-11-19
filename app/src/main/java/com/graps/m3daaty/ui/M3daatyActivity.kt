package com.graps.m3daaty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.ActivityM3daatyBinding

class M3daatyActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityM3daatyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_M3daaty)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_m3daaty)
    }

    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.parent_container)
        _binding.bottomNav.setupWithNavController(navController)
        _binding.bottomNav.itemIconTintList = null
    }
}