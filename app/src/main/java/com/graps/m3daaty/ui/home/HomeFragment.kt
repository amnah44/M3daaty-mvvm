package com.graps.m3daaty.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentHomeBinding
import com.graps.m3daaty.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override val LOG_TAG: String
        get() = TODO("Not yet implemented")
    override val viewModel by activityViewModels<HomeViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentHomeBinding =
        DataBindingUtil::inflate

    override fun setupView() {

    }
}