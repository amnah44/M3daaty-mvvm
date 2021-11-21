package com.graps.m3daaty.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentFoodDetailsBinding
import com.graps.m3daaty.ui.base.BaseFragment
import com.graps.m3daaty.util.Constants

class FoodDetailsFragment : BaseFragment<FragmentFoodDetailsBinding>(R.layout.fragment_food_details){
    override val viewModel by activityViewModels<FoodDetailsViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentFoodDetailsBinding=DataBindingUtil::inflate

    override fun setupView() {

    }

}