package com.graps.m3daaty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.ActivityM3daatyBinding

class M3daatyActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityM3daatyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_m3daaty)
    }
}